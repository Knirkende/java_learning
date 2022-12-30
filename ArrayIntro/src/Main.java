import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main {
	
	public static void main(String... args) { //varargs
		
		int[] intArray = new int[10];
		intArray[5] = 50;
		double[] doubleArray = new double[10];
		doubleArray[2] = 3.5;
		System.out.println(doubleArray[2]);
		int[] initialisedArray = {1,2,3,4,5}; //anonymous array initialiser		
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
		int[] newArray = new int[5];
		
		for (int element : newArray) { //for each loop
			System.out.println(element);
		}
		
		System.out.println(Arrays.toString(newArray));
		
		Object objectVar = newArray;
		
		if (objectVar instanceof int[]) {
			System.out.println("It's an int array.");
		}
		
		Object[] objectArr = new Object[3]; //bad practice object array
		objectArr[1] = "String";
		objectArr[0] = 1;
		
		//sort		
		int[] randArr = getRandomArray(10);		
		Arrays.sort(randArr);
		System.out.println(Arrays.toString(randArr));
		
		//fill		
		int[] anotherArray = new int[10];
		Arrays.fill(anotherArray, 5);
		System.out.println(Arrays.toString(anotherArray));
		
		//copy
		int[] thirdArray = getRandomArray(10);
		int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
		//note: can slice by copying with a smaller end idx
		fourthArray[0] = 1;
		System.out.println(Arrays.toString(thirdArray));
		System.out.println(Arrays.toString(fourthArray));
		
		//NOT deep copy
		int[][] nested = new int[2][2];
		Arrays.fill(nested, new int[]{1, 2});
		int[][] nestedCopy = Arrays.copyOf(nested, nested.length);
		nestedCopy[0][0] = 5;
		for (int[] arr : nested) {
			System.out.println(Arrays.toString(arr));
		}
		
		//binary search		
		int[] searchArray = new int[] {1,2,3,4,5,6,7,8,9};
		int resIdx = Arrays.binarySearch(searchArray, 3);
		int na = Arrays.binarySearch(searchArray, 11);		
		System.out.println(resIdx);
		System.out.println(na);
		
		//equals
		int[] s1 = {1,2,3,4,5};
		int[] s2 = {1,2,3,4,5};
		
		System.out.println(Arrays.equals(s1,  s2));
		
		//exercise driver code
		int[] exerc = new int[] {1,2,3,4,5};
		int[] sorted = Exercise.sortDescending(exerc);
		System.out.println(Arrays.toString(sorted));
		
		//varargs		
		String[] stringArr = "Hello trees of green".split(" ");
		printText(stringArr);
		printText("Hello trees of green");
		printText("Hello", "trees", "of", "green");
		printText();
		
		//exercise 2 driver code
		Scanner scanner = new Scanner(System.in);
		System.out.print("Comma-separated ints: ");
		String inp = scanner.nextLine();
		int[] stuff = readIntegers(inp.split(","));
		System.out.println(Arrays.toString(stuff));
		int min = findMin(stuff);
		System.out.println(min);
	}
	
	private static int[] getRandomArray(int len) {
		Random random = new Random();
		int[] newInt = new int[len];
		
		for (int i = 0; i < len; i++) {
			newInt[i] = random.nextInt(100);
		}
		
		return newInt;
	}
	
	//varargs
	private static void printText(String... textArr) {
		for (String text : textArr) {
			System.out.println(text);
		}
	}
	
	//exercise
	private static int[] readIntegers(String... inp) {
		int[] integerArr = new int[inp.length];
		for (int i = 0; i < inp.length; i++) {
			integerArr[i] = Integer.parseInt(inp[i]);
		}
		return integerArr;
	}
	
	//exercise
	private static int findMin(int[] inp) {
		int[] inpCp = Arrays.copyOf(inp, inp.length);
		Arrays.sort(inp);
		return inp[0];
	}
	
}
