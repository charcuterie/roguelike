package main;

import java.util.HashSet;
import java.util.Set;

import entities.Entity;

public class EntityManager {

	private Set<Entity> entities;
	
	public EntityManager() {
		entities = new HashSet<>();
	}
	
	public void register(Entity e) {
		entities.add(e);
	}
	
	public void remove(Entity e) {
		entities.remove(e);
	}
}
