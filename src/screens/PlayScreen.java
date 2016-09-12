package screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class PlayScreen implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		terminal.write("playing", 1, 1);
		terminal.writeCenter("press [escape] to lose or [Enter] to win", 22);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		switch (key.getKeyCode()) {
		case KeyEvent.VK_ESCAPE:
			return new LoseScreen();
		case KeyEvent.VK_ENTER:
			return new WinScreen();
		default:
			return this;
		}
	}

}
