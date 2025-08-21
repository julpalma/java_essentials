package strings;

public class Switch {

    //switch statement
    //Execute one block of code from several alternatives based on the value of an expression.
    //It needs to use the break to prevent fall-through.
    //No return value.

    public void switchStatementExample() {
        int day = 3;
        String dayName;
        String invalidDay = "Invalid day!";

        switch(day) {
            case 1:
                dayName = Day.MONDAY.toString();
                System.out.println(Day.MONDAY.getDayDescription());
                break;
            case 2:
                dayName = Day.TUESDAY.toString();
                System.out.println(Day.TUESDAY.getDayDescription());
                break;
            case 3:
                dayName = Day.WEDNESDAY.toString();
                System.out.println(Day.WEDNESDAY.getDayDescription());
                break;
            default:
                dayName = invalidDay;
        }
        System.out.println("Today is" + dayName);
    }

    //switch expression (enhanced)
    //Is an expression that evaluates to a single value based on the value of its selector expression.
    //It uses an arrow annotation implicit prevent fall-through, eliminating the need for a break.
    //Returns a value.

    public void switchExpressionExample() {
        int day = 3;
        String invalidDay = "Invalid day!";

        String dayName = switch (day) {
            case 1 -> Day.MONDAY.toString();
            case 2 -> Day.TUESDAY.toString();
            case 3 -> Day.WEDNESDAY.toString();
            default -> invalidDay;
        };

        System.out.println("Today is" + dayName);
    }

}
