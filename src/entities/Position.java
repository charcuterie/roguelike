package entities;

public class Position implements Component {

	public int x;
	public int y;
	
	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}
