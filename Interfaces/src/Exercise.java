import java.util.List;
import java.util.ArrayList;

public class Exercise {

}

interface ISaveable {
	List<String> write();
	void read(List<String> inp);
}

class Player implements ISaveable {
	private String name;
	private String weapon;
	private int hitPoints;
	private int strength;
	
	public Player(String name, int hitPoints, int strength) {
		this.name = name;
		this.hitPoints = hitPoints;
		this.strength = strength;
		this.weapon = "Sword";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public int getHitPoints() {
		return hitPoints;
	}

	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}
	
	@Override
	public List<String> write() {
		List<String> val = new ArrayList<>();
		val.add(name);
		val.add(Integer.toString(hitPoints));
		val.add(Integer.toString(strength));
		val.add(weapon);
		return val;
	}
	
	@Override
	public void read(List<String> n) {
		if (n != null && n.size() > 0) {
			setName(n.get(0));
			setHitPoints(Integer.parseInt(n.get(2)));
			setStrength(Integer.parseInt(n.get(3)));
			setWeapon(n.get(1));
		}
		
	}
	
	@Override
	public String toString() {
		return "Player{name='" + name + ", hitPoints=" + Integer.toString(hitPoints) + ", strength=" + Integer.toString(strength) + ", weapon=" + weapon;
	}
	
}

class Monster implements ISaveable {
	String name;
	int hitPoints;
	int strength;
	
	public Monster(String name, int hitPoints, int strength) {
		this.name = name;
		this.hitPoints = hitPoints;
		this.strength = strength;
	}

	public String getName() {
		return name;
	}

	public int getHitPoints() {
		return hitPoints;
	}

	public int getStrength() {
		return strength;
	}
	
	@Override
	public List<String> write() {
		List<String> val = new ArrayList<>();
		val.add(name);
		val.add(Integer.toString(hitPoints));
		val.add(Integer.toString(strength));
		return val;
	}
	
	@Override
	public void read(List<String> n) {
		if (n != null && n.size() > 0) {
			this.name = n.get(0);
			this.hitPoints = Integer.parseInt(n.get(2));
			this.strength = Integer.parseInt(n.get(3));
		}
		
	}
	
	@Override
	public String toString() {
		return "Player{name='" + name + ", hitPoints=" + Integer.toString(hitPoints) + ", strength=" + Integer.toString(strength);
	}	
	
}