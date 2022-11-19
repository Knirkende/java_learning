public class Exercise {
    public static void main(String[] args) {
        System.out.println(calcPosition(1));
        System.out.println(hasTeen(12, 1, 1));
    }
    public static int calcPosition(int score) {
        if(score > 1000) return 1;
        else if(score > 500) return 2;
        else if(score > 199) return 3;
        return 4;
    }
    public static long toMilesPerHour(double kilometersPerHour) {
        long result = kilometersPerHour >= 0 ? Math.round(kilometersPerHour / 1.609) : -1;
        return result;
    }
    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) System.out.println("Invalid Value");
        else {
            long result = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + result + " mi/h");
        }
    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        return barking && hourOfDay >= 0 && hourOfDay < 24 && (hourOfDay < 8 || hourOfDay > 22);
    }

    public static boolean hasEqualSum(int n1, int n2, int n3) {
        return n1 + n2 == n3;
    }
    private static boolean checkRange(int n) {
        return n > 12 && n < 20;
    }
    public static boolean hasTeen(int n1, int n2, int n3) {
        return checkRange(n1) || checkRange(n2) || checkRange(n3);
    }
}
