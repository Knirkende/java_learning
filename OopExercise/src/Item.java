import java.util.Arrays;

public class Item {
	protected int price;
	
	public int getPrice() {
		return this.price;
	}
}

class Burger extends Item {
	private String type;
	private String[] toppings;
	
	public Burger(String type, int price) {
		this.type = type;
		this.price = price;
		this.toppings = new String[3];
	}
	
	public void addTopping(String topping, int price) {
		int len = (int)Arrays.stream(this.toppings).filter(e -> e != null).count();
		if (len < 3) {
			toppings[len] = topping;
			this.price += price;
		} else {
			System.out.println("Toppings list full. TODO handle it.");
		}
		System.out.println(Arrays.toString(this.toppings));
	}
	
}

class DeluxeBurger extends Burger {
	
	public DeluxeBurger(String type) {
		super(type, 10000);
	}
	
	@Override
	public void addTopping(String topping, int price) {
		super.addTopping(topping, 0);
	}
}

class Drink extends Item {
	private String size;
	
	public Drink(String size) {
		this.size = size;
		this.price = calcPrice();
	}
	
	private int calcPrice() {
		return switch(this.size) {
			case "small" -> 1;
			case "medium" -> 2;
			case "large" -> 3;
			default -> 0;
		};
	}
}

class SideItem extends Item {
	private String type;
	
	public SideItem(String type, int price) {
		this.type = type;
		this.price = price;
	}
}