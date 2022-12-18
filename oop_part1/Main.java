public class Main {
    public static void main(String[] args) {
        Example ex = new Example();
        System.out.println(ex.beep);
        for (int i = 1; i <= 5; i++) {
            StudentRecord s = new StudentRecord(
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
                //System.out.println(s.id());
        }
    Animal animal = new Animal("Generic", "Big", 400);
    doAnimalStuff(animal, "slowly");

    Dog dog = new Dog();
    doAnimalStuff(dog, "dog-speed");
    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_________");
    }
}