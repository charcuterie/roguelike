package main;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

import javax.swing.Action;

import systems.InputSystem;
import systems.RenderSystem;

public class Game {

	private Deque<Action> actions;
	private int time;
	private GameStatus status;
	
	private InputSystem inputSystem;
	private MovementSystem movementSystem;
	private RenderSystem renderSystem;
	
	public Game() {
		actions = new ArrayDeque<>();
		time = 0;
		status = GameStatus.PLAYING;
	}
	
	/*
	 * while(true)
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	public void run() {
		while (status == GameStatus.PLAYING) {
			update();
			time++;
		}
	}
	
	public GameResult update() {
		final GameResult result = new GameResult();
		
		
		while (!actions.isEmpty()) {
			Action action = actions.pop();
			result = action.perform();
			actions.offer(e);
		}
	}
	
	private class GameResult {

		private final List<Event> events;
		private boolean madeProgress = false;
		
		public GameResult() {
			events = new ArrayList<>();
		}
		
		public boolean needsRefresh() {
			return madeProgress || !events.isEmpty();
		}
	}
}