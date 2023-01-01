import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count) {
	
	public GroceryItem(String name) {
		this(name, "DAIRY", 1);
	}
}

public class Main {
	public static void main(String[] args) {
		
		GroceryItem[] groceryArray = new GroceryItem[3];
		groceryArray[0] = new GroceryItem("milk");
		groceryArray[1] = new GroceryItem("apples", "PRODUCE", 6);
		groceryArray[2] = new GroceryItem("oranges", "PRODUCE", 5);
		
		System.out.println(Arrays.toString(groceryArray));
		
		ArrayList rawList = new ArrayList(); // an ArrayList of Objects
		
		List<GroceryItem> myList = new ArrayList<>();
		myList.add(new GroceryItem("yoghurt"));
		myList.add(new GroceryItem("butter"));
		myList.add(0, new GroceryItem("add and displace other items"));
		myList.set(0, new GroceryItem("replace"));
		myList.remove(0);
		
		System.out.println(myList);
		
		String[] items = {"one", "two", "three"};
		
		List<String> list = List.of(items); // immutable List factory method
		System.out.println(list);		
		System.out.println(list.getClass().getName());
		
		List<String> arrList = new ArrayList<>(list); // now it's mutable
		
		List<String> newList = new ArrayList<>(
				List.of("one", "two", "three"));
		
		// accessing items
		System.out.println("Third item = " + newList.get(2));
		
		if (newList.contains("three")) {
			System.out.println("Yep, it's in there.");
		}
		newList.indexOf("three");
		newList.add("three");
		newList.lastIndexOf("Three");
		
		// removing items
		newList.remove(0); // remove by idx
		newList.remove("Three"); // remove by match
		newList.removeAll(List.of("Three", "Two")); //remove all items in list (difference)
		newList.retainAll(List.of("Three", "Two")); // keeps indicated items (intersection)	
		newList.clear(); //remove all
		
	}
}
