import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MyMapTest {

    @Test
    public void shouldCheckSize() {
        //given
        MyMap<String, String> myMap = new MyMap<>();
        myMap.put("USA", "Washington DC");
        myMap.put("Germany", "Berlin");
        //when
        int size = myMap.getSize();
        //then
        assertNotNull(myMap);
        Assertions.assertEquals(2, size);
    }

    @Test
    public void shouldGetValueForGivenKey() {
        //given
        MyMap<String, String> myMap = new MyMap<>();
        myMap.put("Poland", "Warsaw");
        myMap.put("Australia", "Sydney");
        //when
        String result = myMap.get("Poland");
        String result2 = myMap.get("Australia");
        //then
        Assertions.assertEquals("Warsaw", result);
        Assertions.assertEquals("Sydney", result2);
    }

    @Test
    public void shouldCheckIfMapContainsGivenKey() {
        //given
        MyMap<String, String> myMap = new MyMap<>();
        myMap.put("USA", "Washington DC");
        myMap.put("Germany", "Berlin");
        //when
        boolean result = myMap.containsKey("Germany");
        boolean result2 = myMap.containsKey("India");
        //then
        Assertions.assertTrue(result);
        Assertions.assertFalse(result2);
    }

    @Test
    public void shouldCheckIfMapContainsGivenValue() {
        //given
        MyMap<String, String> myMap = new MyMap<>();
        myMap.put("Japan", "Tokyo");
        myMap.put("Germany", "Berlin");
        //when
        boolean result = myMap.containsValue("Tokyo");
        boolean result2 = myMap.containsValue("Helsinki");
        //then
        Assertions.assertTrue(result);
        Assertions.assertFalse(result2);
    }

    @Test
    public void shouldRemoveValueFromGivenKey() {
        //given
        MyMap<String, String> myMap = new MyMap<>();
        myMap.put("Japan", "Tokyo");
        myMap.put("Germany", "Berlin");
        //when
        String removedValue = myMap.remove("Japan");
        //then
        Assertions.assertEquals("Tokyo", removedValue);
        Assertions.assertFalse(myMap.containsKey("Japan"));
        Assertions.assertFalse(myMap.containsValue("Tokyo"));
    }

}
