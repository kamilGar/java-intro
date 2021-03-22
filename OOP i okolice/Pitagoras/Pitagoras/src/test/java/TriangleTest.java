import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest {

    @Test
    void shouldReturnTrueIfTriangleIsRectangular() {
        //given
        Triangle triangle = new Triangle();
        //when
        boolean result = triangle.checkIfRectangular(3,4,5);
        //then
        Assertions.assertTrue(result);
    }
    @Test
    void shouldReturnFalseIfTriangleIsNotRectangular() {
        //given
        Triangle triangle = new Triangle();
        //when
        boolean result = triangle.checkIfRectangular(2,5,9);
        //then
        Assertions.assertFalse(result);
    }

}
