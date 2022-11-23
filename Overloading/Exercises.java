public class Exercises {
    public static void main(String[] args) {
        
    }

    public static double area(double radius) {
        double result = radius >= 0 ? Math.PI * Math.pow(radius, 2) : (double)-1;
        return result;
    }
    public static double area(double x, double y) {
        double result = (x >= 0 && y >= 0) ? x * y : (double)-1;
        return result;
    }
    public static void printYearsAndDays(long minutes) {
        int days = Math.round(minutes / 60 / 24);
        if(minutes >= 0) {
            System.out.println(minutes + " min = " + Math.round(days / 365) + " y and " + days % 365 + " d");
        }
        else {
            System.out.println("Invalid Value");
        }
    }
    public static void printEqual(int n1, int n2, int n3) {
        if(!(n1 >= 0 && n2 >= 0 && n3 >= 0)) System.out.println("Invalid Value");
        else if (n1 == n2 && n2 == n3) System.out.println("All numbers are equal");
        else if (!(n1 == n2 || n1 == n3 || n2 == n3)) System.out.println("All numbers are different");
        else System.out.println("Neither all are equal or different");
    }
}
