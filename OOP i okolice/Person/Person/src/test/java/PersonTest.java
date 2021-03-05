import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {

    Person person1 = new Person("Kamil", "Garbaczewski", "22/02/1999");
    Person person2 = new Person("Kamil", "Garbaczewski", "22/02/1999");

    @Test
    void shouldCheckIfReflexive() {
        boolean result = person1.equals(person1);
        Assertions.assertEquals(true, result);
    }

    @Test
    void shouldCheckIfSymmetric() {
        boolean result1 = person1.equals(person2);
        boolean result2 = person2.equals(person1);
        boolean result = result1 == result2;
        Assertions.assertEquals(true, result);
    }

    @Test
    void shouldCheckNull() {
        boolean result = person1.equals(null);
        Assertions.assertEquals(false, result);
    }

    @Test
    void shouldCheckHashCodes() {
        if (person1.equals(person2)) {
            boolean result = person1.hashCode() == person2.hashCode();
            Assertions.assertEquals(true, result);
        }

    }
}
