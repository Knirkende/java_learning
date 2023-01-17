
public class ScopeCheck {
	public int publicVar = 0;
	private int varOne = 1;
	
	public ScopeCheck() {
		System.out.println("Public = " + publicVar + ", Private = " + varOne);
	}

	public int getVarOne() {
		return varOne;
	}
	
	public void timesTwo() {
		int varTwo = 2;
		for (int i = 0; i<10; i++) {
			System.out.println(i + " x 2 = " + i * varTwo);
		}
	}
	
	public void useInner() {
		InnerClass inner = new InnerClass();
		System.out.println("Private varThree is visible here: " + inner.varThree);
	}
	
	public class InnerClass {
		private int varThree = 3;

		public InnerClass() {
			System.out.println("InnerClass created. " + varThree);
		}
		
	}
	
}
