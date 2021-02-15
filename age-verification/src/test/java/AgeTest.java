import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class AgeTest {
    @Test
    public void shouldReturnTrueWhenIsAdult() {
        // given
        int age = 21;

        // when
        boolean result = Age.checkAge(age);

        // then
        Assertions.assertTrue(result);
    }
}



