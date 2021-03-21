import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyLinkedListTest {

    @Test
    void shouldReturnSize() {
        //given
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addElement("3");
        myLinkedList.addElement("4");
        //when
        int result = myLinkedList.getSize();
        //then
        Assertions.assertEquals(2, result);
    }

    @Test
    void shouldAddElements() {
        //given
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addElement("2");
        myLinkedList.addElement("3");
        myLinkedList.addElement("4");
        //when
        String result = myLinkedList.toString();
        //then
        Assertions.assertEquals("[ 2 3 4 ]", result);
    }

    @Test
    void shouldRemoveElementWithGivenIndex() {
        //given
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addElement("2");
        myLinkedList.addElement("3");
        myLinkedList.addElement("4");
        //when
        myLinkedList.removeElement(1);
        String result = myLinkedList.toString();
        //then
        Assertions.assertEquals("[ 2 4 ]", result);
    }

    @Test
    void shouldAddElementAtGivenIndex() {
        //given
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addElement("2");
        myLinkedList.addElement("3");
        myLinkedList.addElement("4");
        //when
        myLinkedList.insertElement(1,"8");
        String result = myLinkedList.toString();
        //then
        Assertions.assertEquals("[ 2 8 4 ]", result);
    }

}
