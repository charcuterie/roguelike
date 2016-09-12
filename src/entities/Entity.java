package entities;

import java.util.UUID;

public class Entity {
	
	private final UUID id;
	
	public Entity() {
		id = UUID.randomUUID();
	}
	
	public UUID getId() {
		return id;
	}
}
