import java.util.Scanner;

public class Main {
	
	private static Scanner scanner = new Scanner(System.in);
	private static Button btnPrint = new Button("Print");
	
	public static void main(String[] args) {
		GearBox thing = new GearBox(6);
		//GearBox.Gear first = thing.new Gear(1, 12.3);
		//System.out.println(first.driveSpeed(1000));
		
		thing.addGear(1,  5.3);
		thing.addGear(2, 10.6);
		thing.addGear(3, 15.9);
		thing.operateClutch(true);
		thing.changeGear(1);
		thing.operateClutch(false);
		System.out.println(thing.wheelSpeed(1000));
		thing.changeGear(2);
		System.out.println(thing.wheelSpeed(1000));
		thing.operateClutch(true);
		thing.changeGear(3);
		thing.operateClutch(false);
		System.out.println(thing.wheelSpeed(1000));
		
		class ClickListener implements Button.OnClickListener {
			public ClickListener() {
				System.out.println("I've been attached");
			}
			
			@Override
			public void onClick(String title) {
				System.out.println(title + " was clicked");
			}
		}
		
		btnPrint.setOnClickListener(new ClickListener());
		listen();
		
		//anonymous class
		
		btnPrint.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick(String title) {
				System.out.println(title + " was clicked1");				
			}
		});
		
	}
	
	private static void listen() {
		boolean quit = false;
		while(!quit) {
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch(choice) {
			case 0 -> quit = true;
			case 1 -> btnPrint.onClick();
			}
		}
	}
}
