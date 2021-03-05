public class Week {

    public static String daysOfTheWeek(int day) {
        String result = "";
        switch (day) {
            case 1:
                result = "Monday";
                break;
            case 2:
                result = "Tuesday";
                break;
            case 3:
                result = "Wednesday";
                break;
            case 4:
                result = "Thursday";
                break;
            case 5:
                result = "Friday";
                break;
            case 6:
            case 7:
                result = "Weekend";
                break;
            default:
                result = "There is no such day";
        }
        return result;
    }

}
