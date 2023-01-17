import java.util.Scanner;

//challenge: only "x" is allowed as variable name, "X" for classes.

public class Exercise {
	public static void main(String[] args) {
		X x = new X();
		
		x.x(0);
	}
}

class X {
	private int x = 0;
	
	public int x() {
		Scanner x = new Scanner(System.in);
		return x.nextInt();
	}
	
	public void x (int x) {
		x = x();
		for (this.x = 0; this.x <= 12; this.x++) {
			System.out.println(x * this.x);
		}
	}
		
}