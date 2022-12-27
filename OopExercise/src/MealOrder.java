
public class MealOrder {
	private Burger burger;
	private Drink drink;
	private SideItem sideItem;
	
	public MealOrder() {
		this(
			new Burger("regular", 100),
			new Drink("small"),
			new SideItem("fries", 1000),
			new String[3]
			);
	}
	
	public MealOrder(Burger burger, Drink drink, SideItem sideItem, String[] toppings) {
		this.burger = burger;
		this.drink = drink;
		this.sideItem = sideItem;
		for (int i = 0; i < toppings.length; i++) {
			this.burger.addTopping(toppings[i], 10);
		}
	}
	
	public int getTotal() {
		return burger.getPrice() + drink.getPrice() + sideItem.getPrice();
	}
		
}
