
public class EnhancedPlayer {

	private String fullName;
	private int healthPercentage;
	private String weapon;
	
	
	public EnhancedPlayer(String name) {
		this(name, 100, "Sword");
	}

	public EnhancedPlayer(String name, int health, String weapon) {
		super();
		this.fullName = name;		
		this.healthPercentage = health <= 0 ? 1 : health;
		this.healthPercentage = this.healthPercentage > 100 ? 100 : this.healthPercentage;
		this.weapon = weapon;
	}
	
	public void loseHealth(int damage) {
		this.healthPercentage -= damage;
		if (this.healthPercentage <= 0) {
			System.out.println("He's dead, Jim");
		}
	}
	
	public void restoreHealth(int extraHealth) {
		this.healthPercentage += extraHealth;
	}
	
	public int healthRemainaing() {
		return this.healthPercentage;
	}
	
}
