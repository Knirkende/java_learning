
public class SmartKitchen {
	private Refrigerator fridge;
	private DishWasher washer;
	private CoffeeMaker coffee;
	
	private void addWater() {
		coffee.switchWork();
	}
	
	private void pourMilk() {
		fridge.switchWork();
	}
	
	private void loadDishWasher() {
		washer.switchWork();
	}
	
	public void doKitchenWork() {
		addWater();
		pourMilk();
		loadDishWasher();
		fridge.orderFood();
		washer.doDishes();
		coffee.brewCoffee();
	}
}