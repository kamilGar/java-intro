import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TextCheckTest1 {

    TextCheck1 text1 = new TextCheck1("");
    TextCheck1 text2 = new TextCheck1("Kajak");
    TextCheck1 text3 = new TextCheck1("Hamak");

    @Test
    void shouldCheckEmptyTextLength() {
        int result = text1.textLength();
        Assertions.assertEquals(0, result);
    }

    @Test
    void shouldCheckLength() {
        int result = text2.textLength();
        Assertions.assertEquals(5, result);
    }

    @Test
    void shouldCheckIfPalindrome() {
        boolean result = text2.checkIfPalindrome();
        Assertions.assertTrue(result);
    }

    @Test
    void shouldCheckIfPalindrome2() {
        boolean result = text3.checkIfPalindrome();
        Assertions.assertFalse(result);
    }

}
