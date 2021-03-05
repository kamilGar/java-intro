import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WeekTest {

    @Test
    void shouldReturnFriday() {
        String result = Week.daysOfTheWeek(5);
        Assertions.assertEquals("Friday", result);

    }

    @Test
    void shouldReturnWeekend() {
        String result = Week.daysOfTheWeek(6);
        Assertions.assertEquals("Weekend", result);

    }

    @Test
    void shouldReturnNoSuchDay() {
        String result = Week.daysOfTheWeek(9);
        Assertions.assertEquals("There is no such day", result);

    }
}
