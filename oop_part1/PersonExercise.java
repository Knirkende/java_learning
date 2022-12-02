public class PersonExercise {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public void setFirstName(String n) {
        this.firstName = n;
    }
    public void setLastName(String n) {
        this.lastName = n;
    }
    public void setAge(int n) {
        this.age = (n < 0 || n > 100) ? 0 : n;
    }
    public boolean isTeen() {
        return (age > 12 && age < 20);
    }
    public String getFullName() {
        return (this.firstName + " " + this.lastName).trim();
    }
}
