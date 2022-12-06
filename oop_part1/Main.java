public class Main {
    public static void main(String[] args) {
        Example ex = new Example();
        System.out.println(ex.beep);
        for (int i = 1; i <= 5; i++) {
            StudentPojo s = new StudentPojo(
                "123" + i,
                switch (i) {
                    case 1 -> "one";
                    case 2 -> "two";
                    case 3 -> "three";
                    case 4 -> "four";
                    case 5 -> "five";
                    default -> "nothing";
                },
                "5445",
                "blabla");
        }
    }
}