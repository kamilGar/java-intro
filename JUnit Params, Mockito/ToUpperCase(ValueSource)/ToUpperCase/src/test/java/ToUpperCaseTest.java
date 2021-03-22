import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

public class ToUpperCaseTest {

    @ParameterizedTest
    @ValueSource(strings = {"Tekst","tekst","TEkST"})
    void shouldConvertToUpperCase(String input) {
        String actualValue = ToUpperCase.convertToUpper(input);
        Assertions.assertEquals("TEKST", actualValue);
    }

    @ParameterizedTest
    @NullAndEmptySource
    void shouldConvertEmptyAndNull(String input) {
        String actualValue = ToUpperCase.convertToUpper(input);
        Assertions.assertEquals("", actualValue);
    }

}
