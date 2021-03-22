import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TextFormatterTest {

    TextClass1 text1 = new TextClass1();
    TextClass2 text2 = new TextClass2();

    @Test
    void shouldFormatToUpperCase() {
        String result = text1.formatText("Litwo, Ojczyzno moja");
        Assertions.assertEquals("LITWO, OJCZYZNO MOJA", result);

    }

    @Test
    void shouldFormatToLowerCase() {
        String result = text2.formatText("Litwo, Ojczyzno moja");
        Assertions.assertEquals("litwo, ojczyzno moja", result);

    }

}

