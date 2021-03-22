import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WeekTest {

    @Test
    void shouldReturnFriday() {
        String result = WeekMain.daysOfTheWeek(5);
        Assertions.assertEquals("Friday", result);

    }

    @Test
    void shouldReturnWeekend() {
        String result = WeekMain.daysOfTheWeek(6);
        Assertions.assertEquals("Weekend", result);

    }

    @Test
    void shouldReturnNoSuchDay() {
        String result = WeekMain.daysOfTheWeek(9);
        Assertions.assertEquals("There is no such day", result);

    }
}
