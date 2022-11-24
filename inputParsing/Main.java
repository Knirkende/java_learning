import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String numStr = "2018";
        int num = Integer.parseInt(numStr);
        System.out.println(num + 1);
        double numDouble = Double.parseDouble(numStr);
        System.out.println(numDouble);

        // Scanner
        int numNum = -1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter stuff: ");
        String name = scanner.nextLine();

        System.out.println("Enter num: ");
        
        if ( scanner.hasNextInt() ) {
            numNum = scanner.nextInt();
        } else {
            System.out.println("Good job. Great.");
        }
        
        scanner.close();
        System.out.println("Stuff was " + name);
        System.out.println("Num was " + numNum);

    }
}