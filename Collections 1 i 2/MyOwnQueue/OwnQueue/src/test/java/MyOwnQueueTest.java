import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyOwnQueueTest {

    @Test
    void shouldAddElementOnTheEnd() {
        //given
        MyOwnQueue myOwnQueue = new MyOwnQueue(2);
        //when
        myOwnQueue.add(1);
        boolean result = myOwnQueue.add(2);
        //then
        Assertions.assertTrue(result);
        Assertions.assertEquals(1,myOwnQueue.element());
    }

    @Test
    void shouldRemoveAndReturnFirstElement() {
        //given
        MyOwnQueue myOwnQueue = new MyOwnQueue(3);
        //when
        myOwnQueue.add(1);
        myOwnQueue.add(2);
        myOwnQueue.add(3);
        Integer result = myOwnQueue.remove();
        //then
        Assertions.assertEquals(1,result);
        Assertions.assertEquals(2,myOwnQueue.element());
    }

}
