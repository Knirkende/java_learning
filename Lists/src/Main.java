import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

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
		
		// adding elements to ArrayList has a constant amortised time cost ( O(1)* )
		
		// LinkedList (is doubly linked)
		
		LinkedList<Integer> linked = new LinkedList<>();
		// add
		linked.add(1);
		linked.add(0, 4);
		linked.add(1, 5);
		linked.addFirst(6);
		linked.addLast(7);
		linked.offer(8); // add as tail
		linked.offerFirst(9); // add as head
		linked.offerLast(10); // add as tail
		linked.push(11); // push to top of stack
		System.out.println(linked);
		//remove
		linked.remove(0); //remove by index
		linked.remove(); // remove and return first element
		linked.removeFirst();
		linked.removeLast();
		int i = linked.poll(); //remove and return first element
		System.out.println(i);
		i = linked.pollFirst(); //remove and return first element
		System.out.println(i);
		i = linked.pollLast(); //remove and return last element
		System.out.println(i);
		linked.push(11);
		System.out.println(linked);
		i = linked.pop(); //remove and return top of the stack (element 0)
		System.out.println(i);
		i = linked.get(1); //retrieve element at idx
		linked.getFirst();
		linked.getLast();
		System.out.println(i);
		linked.indexOf(1);
		//queue retrieval
		System.out.println(linked.element()); //retrieve head
		//stack retrieval
		System.out.println(linked.peek()); //retrieve head
		linked.peekFirst(); //equivalent to peek()
		linked.peekLast();
		
		System.out.println(linked);
		
		// iterators
		
		ListIterator<Integer> iterator = linked.listIterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
}
