// records are immutable.
// getters are methods with the same name as the field (ex. id()).

public record StudentRecord(String id, String name, String dateOfBirth, String classList) {
    
}
