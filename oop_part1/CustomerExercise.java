public class CustomerExercise {

    private String name;
    private int creditLimit;
    private String emailAddress;

    public CustomerExercise(String name, int creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public CustomerExercise(String name, String emailAddress) {
        this(name, 5, emailAddress);
    }

    public CustomerExercise() {
        this("Lol", "Lol");
    }

    public String getName() {
        return this.name;
    }

    public int getCreditLimit() {
        return this.creditLimit;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

}
