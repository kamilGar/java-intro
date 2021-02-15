


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class SeatingTest {

    @Test
    public void shouldShowNotEmptySeat() {
        // given
        Details det = new Details(true, 2, 1);

        // when
        boolean result = det.isEmpty();

        // then
        Assertions.assertTrue(result);
    }

}










