import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ReversedStringTest {

    @ParameterizedTest
    @CsvSource(value = {"kajak:kajak", "string:gnirts", "reverse:esrever"}, delimiter = ':')
    void shouldReverseString(String input, String expected) {
        String actualValue = ReversedString.reverse(input);
        Assertions.assertEquals(actualValue, expected);
    }

}
