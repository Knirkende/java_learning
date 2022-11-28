import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        //System.out.println(canPack(2, 1, 5));
        //inputThenPrintSumAndAverage();
        System.out.println(getBucketCount(3.4,2.1,1.5,2));
    }

    public static boolean canPack (int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) return false;
        if (bigCount * 5 <= goal) {
            return smallCount >= (goal - bigCount * 5);
        } return smallCount >= goal % 5;
    }
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int counter = 0;
        while (scanner.hasNextInt()) {
            total += scanner.nextInt();
            counter += 1;
        }
        scanner.close();
        System.out.println("SUM = " + total + " AVG = " + Math.round((double)total / counter));
    }
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) return -1;
        int result = (int)(Math.ceil((width * height) / areaPerBucket)) - extraBuckets;
        result = result > 0 ? result : 0;
        return result;
    }
    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) return -1;
        int result = (int)(Math.ceil((width * height) / areaPerBucket));
        result = result > 0 ? result : 0;
        return result;
    }
    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) return -1;
        int result = (int)(Math.ceil((area) / areaPerBucket));
        result = result > 0 ? result : 0;
        return result;
    }
}
