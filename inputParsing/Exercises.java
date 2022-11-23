public class Exercises {
    public static void main(String[] args) {
        System.out.println(canPack(2, 1, 5));
    }

    public static boolean canPack (int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) return false;
        if (bigCount * 5 <= goal) {
            return smallCount >= (goal - bigCount * 5);
        } return smallCount >= goal % 5;
    }
}
