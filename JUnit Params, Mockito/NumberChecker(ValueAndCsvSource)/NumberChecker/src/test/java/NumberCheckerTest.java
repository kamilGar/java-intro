import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class NumberCheckerTest {

    @ParameterizedTest
    @ValueSource(strings = {"-2","2", "4"})
    void shouldCheckIfEven(int input) {
        boolean actualValue = NumberChecker.checkIfEven(input);
        Assertions.assertTrue(actualValue );
    }

    @ParameterizedTest
    @ValueSource(strings = {"-7","3", "5"})
    void shouldCheckIfEven2(int input) {
        boolean actualValue = NumberChecker.checkIfEven(input);
        Assertions.assertFalse(actualValue );
    }

    @ParameterizedTest
    @CsvSource(value = {"23:5", "357:15", "1003:4"}, delimiter = ':')
    void shouldCalculateSumOfDigits(int input, int expected) {
        int actualValue = NumberChecker.calculateSumOfDigits(input);
        Assertions.assertEquals(actualValue, expected);
    }




}
