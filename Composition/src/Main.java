public class Main {
	public static void main(String[] args) {
		
		ComputerCase theCase = new ComputerCase("2008", "Dell", "240");
		Monitor theMonitor = new Monitor("27asdasd", "Acer", 27, "22342 x 132123");
		Motherboard theMotherboard = new Motherboard("df3", "asdfds", 4, 6, "as");
		PersonalComputer theComputer = new PersonalComputer(
				"324324", "Dell", theMonitor, theMotherboard, theCase);
		
		theComputer.powerOn();
	}
	
}