import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import java.time.Month;

public class MonthClassTest {

    @ParameterizedTest
    @ValueSource(ints = {1,2,12})
    void shouldReturnWinter(int input) {
        Season actualValue = MonthClass.getSeason(input);
        Assertions.assertEquals(Season.WINTER, actualValue);
    }
    @ParameterizedTest
    @ValueSource(ints = {3,4,5})
    void shouldReturnSpring(int input) {
        Season actualValue = MonthClass.getSeason(input);
        Assertions.assertEquals(Season.SPRING, actualValue);
    }
    @ParameterizedTest
    @ValueSource(ints = {6,7,8})
    void shouldReturnSummer(int input) {
        Season actualValue = MonthClass.getSeason(input);
        Assertions.assertEquals(Season.SUMMER, actualValue);
    }
    @ParameterizedTest
    @ValueSource(ints = {9,10,11})
    void shouldReturnAutumn(int input) {
        Season actualValue = MonthClass.getSeason(input);
        Assertions.assertEquals(Season.AUTUMN, actualValue);
    }
}
