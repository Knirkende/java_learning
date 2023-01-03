import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ListIterator;

record Place(String name, int distance) {}

class SortByDistance implements Comparator<Place> {	
	public int compare(Place a, Place b) {
		return a.distance() - b.distance();
	}
}

public class SecondExercise {
	
	protected static ArrayList<Place> buildItinerary(String[] names, int[] distances) {
		
		ArrayList<Place> it = new ArrayList<>(names.length);
		
		for( int i = 0; i < names.length; i++ ) {
			it.add(new Place(names[i], distances[i]));
		}
		
		return it;
	}
	

	public static void main(String[] args) {
		
		String[] names = {
				"Adelaide",
				"Alice Springs",
				"Brisbane",
				"Darwin",
				"Melbourne",
				"Perth"
		};		
		int[] distances = {
				1374,
				2771,
				917,
				3972,
				877,
				3923
		};
		
		ArrayList<Place> it = buildItinerary(names, distances);		
		Collections.sort(it, new SortByDistance());		
		LinkedList<Place> itinerary = new LinkedList<>();
		
		for ( Place place : it ) {
			itinerary.add(place);
		}
		
		ListIterator iterator = itinerary.listIterator();
		
		for ( int i = 0; i < 3; i++) {
			System.out.println("Step forward: ");
			System.out.println(iterator.next());
		}
		
		for ( int i = 3; i > 0; i--) {
			System.out.println("Step backward: ");
			System.out.println(iterator.previous());
		}
		
		System.out.println("List all: ");		
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
}
