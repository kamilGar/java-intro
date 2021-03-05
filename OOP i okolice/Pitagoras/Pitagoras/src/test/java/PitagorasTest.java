import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PitagorasTest {

    @Test
    void shouldCheck345() {
        boolean result = Pitagoras.checkIfRectangular(3,4,5);
        Assertions.assertEquals(true, result);
    }
    @Test
    void shouldCheck259() {
        boolean result = Pitagoras.checkIfRectangular(2,5,9);
        Assertions.assertEquals(false, result);
    }

}
