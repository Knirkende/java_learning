
public class Main {
	public static void main(String[] args) {
		MealOrder defaultOrder = new MealOrder();
		MealOrder advOrder = new MealOrder(
					new Burger("burg", 10),
					new Drink("medium"),
					new SideItem("salad", 1),
					new String[]{"a thing"}
				);
		MealOrder deluxe = new MealOrder(
					new DeluxeBurger("fancyburg"),
					new Drink("medium"),
					new SideItem("salad", 1),
					new String[]{"ee", "aa", "oo"}
				);
		System.out.println(defaultOrder.getTotal());
		System.out.println(advOrder.getTotal());
		System.out.println(deluxe.getTotal());
	}
}
