import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

public class TextTest {

    @ParameterizedTest
    @MethodSource("prepareSample")
    void shouldReturnTextLength(String str, int expected) {
        int result = Text.textLength(str);
        Assertions.assertEquals(result, expected);
}

    private static Stream<Arguments> prepareSample() {
        return Stream.of(
                Arguments.of(new String("Test"), 4),
                Arguments.of(new String("TestTest"), 8),
                Arguments.of(new String(""), 0)
        );

    }

}
