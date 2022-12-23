
public class Printer {
	private int tonerLevel;
	private int pagesPrinted;
	private boolean duplex;
	
	public Printer(int tonerLevel, boolean duplex) {
		this.tonerLevel = tonerLevel < -1 || tonerLevel > 100 ? -1 : tonerLevel;
		this.duplex = duplex;
	}
	
	public int addToner(int tonerAmount) {
		if (this.tonerLevel + tonerAmount > 100 || tonerAmount <= 0 || tonerAmount > 100) {
			return -1;
		}
		this.tonerLevel += tonerAmount;
		return this.tonerLevel;
	}
	
	public int printPages(int pages) {
		int sheets = pages;
		if (duplex) {
			sheets = (int)Math.ceil((double)pages/2);
		}
		this.pagesPrinted += sheets;
		return sheets;
	}
	
	public int getPagesPrinted() {
		return this.pagesPrinted;
	}
}
