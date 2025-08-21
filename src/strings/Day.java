package strings;

public enum Day {
    SUNDAY("The first day of the week."),
    MONDAY("The second day of the week, start of the work week."),
    TUESDAY("The third day of the week."),
    WEDNESDAY("The fourth day of the week, mid-week."),
    THURSDAY("The fifth day of the week."),
    FRIDAY("The sixth day of the week, end of the work week."),
    SATURDAY("The seventh day of the week, part of the weekend.");

    private final String description;

    //Constructor for the enum constants
    Day(String description) {
        this.description = description;
    }

    //Method to get the descriptions
    public String getDayDescription() {
        return description;
    }

    //Print all seasons. Example of a static method.
    public static void printAllDayDescriptions() {
        for (Day d : Day.values()) {
            System.out.println(d.name() + ": " + d.getDayDescription());
        }
    }
}
