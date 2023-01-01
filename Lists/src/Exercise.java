import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Exercise {
	public static void main(String[] args) {
		List<String> arrL = new ArrayList<>();
		int choice = -1;
		while (choice != 0) {
			choice = menu();
			switch (choice) {
				case 1 -> addStuff(arrL);
				case 2 -> removeStuff(arrL);
			}
		}
		System.out.println(arrL);
	}
	
	public static int menu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("0 = exit, 1 = add, 2 = remove: ");
		int choice = scanner.nextInt();
		scanner.close();
		return choice;
	}
	
	public static void addStuff(List<String> arrList) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Comma-separated list of stuff to add: ");
		arrList.addAll(List.of(scanner.nextLine().split(",")));
		scanner.close();
	}
	
	public static void removeStuff(List<String> arrList) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Comma-separated list of stuff to remove: ");
		arrList.removeAll(List.of(scanner.nextLine().split(",")));
		scanner.close();
	}
}
