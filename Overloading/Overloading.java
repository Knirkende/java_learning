public class Overloading {

    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(1, 13));
        System.out.println(calcFeetAndInchesToCentimeters(1));
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored" + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        return score * 1000;
    }
    //exercise
    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
        if (!(feet >= 0 && inches >= 0 && inches <= 12)) return (double)-1;
        return (double)(30.48d * feet + 2.54d*inches);
    }
    public static double calcFeetAndInchesToCentimeters(int inches) {
        if (!(inches >= 0)) return (double)-1;
        return (double)(2.54d * inches);
    }
}