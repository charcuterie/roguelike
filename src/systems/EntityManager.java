package systems;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import entities.Component;

public class EntityManager {

	private List<UUID> allEntities;
	private Map<Class<?>, Map<UUID, ? extends Component>> componentStores;

	public <T extends Component> T getComponent(UUID entity, Class<T> componentType) {
		Map<UUID, ? extends Component> store = componentStores.get(componentType);
		
		if (store == null) {
			throw new IllegalArgumentException("GET FAIL: There are no entities with a Component of class " + componentType);
		}
		
		@SuppressWarnings("unchecked")
		T result = (T) store.get(entity);
		
		if (result == null) {
			throw new IllegalArgumentException("GET FAIL:");
		}
		
		return result;
	}
	
	public <T extends Component> void removeComponent(UUID entity, T component) {
		Map<UUID, ? extends Component> store = componentStores.get(component.getClass());
		
		if (store == null) {
			throw new IllegalArgumentException("REMOVE FAIL: There are no entities with a Component of class " + component.getClass());
		}
		
		@SuppressWarnings("unchecked")
		T result = (T) store.remove(entity);
		
		if (result == null) {
			throw new IllegalArgumentException("REMOVE FAIL:");
		}
	}
	
	@SuppressWarnings("unchecked")
	public <T extends Component> void addComponent(UUID entity, T component) {
		Map<UUID, ? extends Component> store = componentStores.get(component.getClass());
		if (store == null) {
			store = new HashMap<>();
			componentStores.put(component.getClass(), store);
		}
		
		((Map<UUID, T>) store).put(entity, component);
	}
	
	public <T extends Component> boolean hasComponent(UUID entity, Class<T> componentType) {
		Map<UUID, ? extends Component> store = componentStores.get(componentType);
		
		if (store == null) {
			return false;
		}
		return store.containsKey(entity);
	}
	
	public UUID createEntity() {
		final UUID id = UUID.randomUUID();
		allEntities.add(id);
		return id;
	}
	
	public void killEntity(UUID entity) {
		for (Map<UUID, ? extends Component> store : componentStores.values()) {
			store.remove(entity);
		}
		allEntities.remove(entity);
	}
}