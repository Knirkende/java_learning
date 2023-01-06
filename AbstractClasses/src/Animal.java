
public abstract class Animal {
	private String name;

	public Animal(String name) {
		super();
		this.name = name;
	}
	
	public abstract void eat();
	public abstract void breathe();

	public String getName() {
		return name;
	}
	
	
}

interface CanFly {
	void fly();
}

abstract class Bird extends Animal {

	public Bird(String name) {
		super(name);
	}

	@Override
	public void eat() {
		System.out.println("Breathing bird");
		
	}

	@Override
	public void breathe() {
		System.out.println("Nom bird");
		
	}

}

class Pigeon extends Bird implements CanFly {

	public Pigeon(String name) {
		super(name);
	
	}

	@Override
	public void fly() {
		System.out.println("Flying");
		
	}
	
}

class Dog extends Animal {

	public Dog(String name) {
		super(name);
	}
	
	public void breathe() {
		System.out.println("Breathing");
	}
	
	public void eat() {
		System.out.println("Nom");
	}
	
}