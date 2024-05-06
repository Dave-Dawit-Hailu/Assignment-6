//import java.io.Serializable;

public enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    // Method to convert a string representation of a day into its corresponding enum value
    public static Day fromString(String dayString) {
        switch (dayString.toUpperCase()) {
            case "MONDAY":
                return MONDAY;
            case "TUESDAY":
                return TUESDAY;
            case "WEDNESDAY":
                return WEDNESDAY;
            case "THURSDAY":
                return THURSDAY;
            case "FRIDAY":
                return FRIDAY;
            case "SATURDAY":
                return SATURDAY;
            case "SUNDAY":
                return SUNDAY;
            default:
                throw new IllegalArgumentException("Invalid day: " + dayString);
        }
    }

    
}

