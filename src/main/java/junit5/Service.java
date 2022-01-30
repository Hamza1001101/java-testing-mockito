package junit5;

public record Service(Database database) {

    public boolean query(String query) {
        return database.isAvailable();
    }

    @Override
    public String toString() {
        return "Using database with id: " + String.valueOf(database.getUniqueId());
    }
}
