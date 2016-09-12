package main;

import java.awt.Color;
import asciiPanel.AsciiPanel;

public enum Tile {
	FLOOR((char) 250, AsciiPanel.yellow),
	WALL((char) 177, AsciiPanel.yellow),
	BOUNDS('x', AsciiPanel.brightBlack);
	
	public final char glyph;
	public final Color color;
	
	Tile(char glyph, Color color) {
		this.glyph = glyph;
		this.color = color;
	}
}
