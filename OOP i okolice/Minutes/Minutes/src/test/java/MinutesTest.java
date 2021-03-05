import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinutesTest {

    @Test
    void shouldConvertMinutes() {
        int result = Minutes.convertMinutesToSeconds(11);
        Assertions.assertEquals(660, result);
    }
}

