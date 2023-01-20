package az.iktlab.project;

public enum Commands {

    OB("Online - Board"),
    SHF("Show the flight info"),
    SBF("Search and book a flight"),
    CB("Cancel the booking"),
    MF("My flight"),
    EXIT("Exit");


    private final String description;

    Commands(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
