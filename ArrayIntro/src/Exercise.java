import java.util.Arrays;

public class Exercise {
	
	public static int[] sortDescending(int[] inp) {
		//returns a shallow copy of inp sorted in descending order
		int[] sorted = Arrays.copyOf(inp, inp.length);
		Arrays.sort(sorted);
		int[] newArr = new int[sorted.length];
		for (int i = sorted.length - 1; i >= 0; i--) {
			newArr[i] = sorted[sorted.length - i - 1];
		}
		return newArr;
	}
}
