public class Dog extends Animal {

    private String earShape;
    private String tailShape;

    public Dog() {
        super("Unknown dog", "Unknown size", -1);
    }

    public Dog(String earShape, String tailShape, String size, double weight) {
        super("Dog", size, weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    public void move(String speed) {
        if (speed == "slow") {
            makeNoise();
        }
    }

    @Override
    public void makeNoise() {
        if (type == "Wolf") { // inherited protected field
            System.out.println("Wooo");
        } else {
            bark();
        }
    }

    private void bark() {
        System.out.println("Woof");
    }
}
