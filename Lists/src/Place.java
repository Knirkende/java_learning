import java.util.Comparator;

public record Place(String name, int distance) {}

class SortByDistance implements Comparator<Place> {	
	public int compare(Place a, Place b) {
		return a.distance() - b.distance();
	}
}