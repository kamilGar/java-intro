import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class EvenNumbersMainTest {
    @Test
    void shouldReturnParzystaWhenNumberIsEven(){
        // given
        int age = 14;

        // when
        String result = EvenNumbersMain.isEven(age);

        // then
        Assertions.assertEquals("parzysta", result);
    }
}
