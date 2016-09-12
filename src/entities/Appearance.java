package entities;

import java.awt.Color;

public class Appearance implements Component {

	public char glyph;
	public Color color;
	public boolean isVisible;
	
	public Appearance(char glyph, Color color, boolean isVisible) {
		this.glyph = glyph;
		this.color = color;
		this.isVisible = isVisible;
	}
	
	public Appearance(char glyph, Color color) {
		this(glyph, color, true);
	}
}
