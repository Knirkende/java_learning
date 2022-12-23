
public class Main {
	public static void main(String[] args) {
		
		Player player = new Player();
		EnhancedPlayer p2 = new EnhancedPlayer("Lol", 200, "Sword");
		
		System.out.println("H: " + p2.healthRemainaing());
	}
}
