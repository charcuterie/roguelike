package actions;

import java.util.Deque;

import entities.Entity;
import options.Volume;

public abstract class Action {

	private final Entity agent;
	private Volume volume = Volume.AUDIBLE;
	private Deque<Action> actions;
	
	public Action(Entity e) {
		agent = e;
	}
	
	public Entity agent() {
		return agent;
	}
	
	public Volume volume() {
		return volume;
	}
	
	public abstract ActionResult onPerform();
	
	
}
