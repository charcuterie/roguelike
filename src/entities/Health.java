package entities;

public class Health {

	public int health;
	public int maxHealth;
	
	public Health(int health, int maxHealth) {
		this.health = health;
		this.maxHealth = maxHealth;
	}
	
	public Health(int health) {
		this.health = health;
		maxHealth = health;
	}
}