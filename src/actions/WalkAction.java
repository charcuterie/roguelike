package actions;

import entities.Entity;

public class WalkAction extends Action {

	private final int xOffset;
	private final int yOffset;
	
	public WalkAction(Entity agent, int xOffset, int yOffset) {
		super(agent);
		this.xOffset = xOffset;
		this.yOffset = yOffset;
	}
	
	
}
