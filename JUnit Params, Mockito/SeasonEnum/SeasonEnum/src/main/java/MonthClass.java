import java.time.Month;

public class MonthClass {

    public static Season getSeason(int monthNumber) {
        if (monthNumber > 8 && monthNumber <= 11) {
            return Season.AUTUMN;
        } else if (monthNumber > 2 && monthNumber <= 5){
            return Season.SPRING;
        } else if (monthNumber > 5 && monthNumber <= 8) {
            return Season.SUMMER;
        } else {
            return Season.WINTER;
        }
    }
}
//