
public class Main {
	public static void main(String[] args) {
		String varFour = "this is private to main";
		
		ScopeCheck scopeInstance = new ScopeCheck();
		
		System.out.println("scopeInstance varOne = " + scopeInstance.getVarOne());
		System.out.println(varFour);
		
		scopeInstance.timesTwo();
		
		ScopeCheck.InnerClass inner = scopeInstance.new InnerClass();
	}
}
