
public class Player {
	
	private String name;
	private int health;
	private String weapon;
	
	public void loseHealth(int damage) {
		this.health -= damage;
		if (this.health <= 0) {
			System.out.println("He's dead, Jim");
		}
	}
	
	public void restoreHealth(int extraHealth) {
		this.health += extraHealth;
	}
	
	public int healthRemainaing() {
		return this.health;
	}
}
