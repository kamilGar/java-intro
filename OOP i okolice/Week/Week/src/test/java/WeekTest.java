import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WeekTest {

    @Test
    void shouldReturnFriday() {
        // given
        Week week = new Week();
        // when
        String result = week.daysOfTheWeek(5);
        // then
        Assertions.assertEquals("Friday", result);

    }

    @Test
    void shouldReturnWeekend() {
        // given
        Week week = new Week();
        // when
        String result = week.daysOfTheWeek(6);
        // then
        Assertions.assertEquals("Weekend", result);

    }

    @Test
    void shouldReturnNoSuchDay() {
        // given
        Week week = new Week();
        // when
        String result = week.daysOfTheWeek(9);
        // then
        Assertions.assertEquals("There is no such day", result);

    }
}
