import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class AgeTest {
    @Test

    public void Over18 (){
        String result = Age.CheckAge(21);
        Assertions.assertEquals("pelnoletni", result);



    }
}


