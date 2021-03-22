import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShapeInterfaceTest {

    @Test
    void shouldCalculateCircle() {
        //given
        Circle circle = new Circle(5);
        //when
        double resultArea = circle.calculateArea();
        double resultPerimeter = circle.calculatePerimeter();
        //then
        Assertions.assertEquals(Math.PI*25, resultArea);
        Assertions.assertEquals(Math.PI*10, resultPerimeter);

    }

    @Test
    void shouldCalculateRectangle() {
        //given
        Rectangle rectangle = new Rectangle(2,3);
        //when
        double resultArea = rectangle.calculateArea();
        double resultPerimeter = rectangle.calculatePerimeter();
        //then
        Assertions.assertEquals(6, resultArea);
        Assertions.assertEquals(10, resultPerimeter);

    }

}
