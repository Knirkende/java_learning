public class Exercise {
    public static void main(String[] args) {
        //System.out.println(calcPosition(1));
        //System.out.println(hasTeen(12, 1, 1));
        char c;

        c = 'A';
        
        switch(c) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("Yep");
                break;
            default:
                System.out.println("Nope");
                break;
        }
        int counter = 0;

        for (int i = 10; true; i++) {
            if (isPrime(i)) counter++;
            if (counter >= 3) break;
        }
        //System.out.println(isPalindrome(11211));
        System.out.println(sumFirstAndLastDigit(202));
    }

    public static boolean isPrime(int n) {
        if (n == 1) return false;
        for (int i = 2; i < (long) Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        System.out.println("Prime: " + n);
        return true;
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
    //section 5 exercises
    public static void printNumberInWord(int n) {
        String r;
        switch (n) {
            case 0:
                r = "ZERO";
                break;
            case 1:
                r = "ONE";
                break;
            case 2:
                r = "TWO";
                break;
            case 3:
                r = "THREE";
                break;
            case 4:
                r = "FOUR";
                break;
            case 5:
                r = "FIVE";
                break;
            case 6:
                r = "SIX";
                break;
            case 7:
                r = "SEVEN";
                break;
            case 8:
                r = "EIGHT";
                break;
            case 9:
                r = "NINE";
                break;
            default:
                r = "OTHER";
        }
        System.out.println(r);
    }
    public static void printNumberInWordAlt(int n) {
        String s;
        String[] a = {"ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};
        if (n < 10 && n >= 0) s = a[n];
        else s = "OTHER";
        System.out.println(s);
    }
    public static boolean isOdd(int n) {
        return (n >= 0 && n % 2 != 0);
    }
    public static int sumOdd(int start, int end) {
        if (start > end || start < 0) return -1;
        int result = 0;
        for (int i = start; i <= end; i++) {
            result = isOdd(i) ? result + i : result;
        }
        return result;
    }
    public static boolean isPalindrome(int n) {
        n = Math.abs(n);
        int revNum = 0;
        int origNum = n;
        while (n > 0) {
            revNum *= 10;
            revNum += (n % 10);
            n /= 10;
        }
        return revNum == origNum;
    }
    public static int sumFirstAndLastDigit(int n) {
        if (n < 0) return -1;
        int lastDigit = n % 10;
        while (n / 10 > 0) {
            n /= 10;
        }
        return n + lastDigit;
    }
}
