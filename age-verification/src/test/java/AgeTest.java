import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class AgeTest {
    @Test
// should return .... + when ...
    public void shouldReturnFalseWhenIsNotAdult (){
        String result = Age.CheckAge(21);
        Assertions.assertEquals("pelnoletni", result);



    }
}


