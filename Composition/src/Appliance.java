
public class Appliance {

	private boolean hasWorkToDo;
	
	public Appliance() {
		this.hasWorkToDo = false;
	}
	
	public void switchWork() {
		this.hasWorkToDo = this.hasWorkToDo ? false : true;
	}
	
}

class Refrigerator extends Appliance {
	
	public void orderFood() {
		System.out.println("Food was ordered.");
		switchWork();
	}
}

class DishWasher extends Appliance {
	
	public void doDishes() {
		System.out.println("Dishes were done.");
		switchWork();
	}
}

class CoffeeMaker extends Appliance {
	
	public void brewCoffee() {
		System.out.println("Coffee was brewed.");
		switchWork();
	}
}