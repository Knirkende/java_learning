public class StudentPojo {
    private String id;
    private String name;
    private String dateOfBirth;
    private String classList;

    public StudentPojo(String id, String name, String dateOfBirth, String classList) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.classList = classList;
    }

    @Override
    public String toString() {
        return "StudentPojo [id=" + id + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", classList=" + classList
                + "]";
    }

}
