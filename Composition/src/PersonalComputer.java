
public class PersonalComputer extends Product {
	
	private Monitor monitor;
	private Motherboard motherboard;
	private ComputerCase computerCase;
	
	public PersonalComputer(String model, String manufacturer,
			Monitor monitor, Motherboard motherboard,
			ComputerCase computerCase) {
		super(model, manufacturer);
		this.computerCase = computerCase;
		this.monitor = monitor;
		this.motherboard = motherboard;
	}

	private void drawLogo() {
		monitor.drawPixelAt(12, 12, "yellow");
	}
	
	public void powerOn() {
		computerCase.pressButton();
		drawLogo();
	}
	
}
