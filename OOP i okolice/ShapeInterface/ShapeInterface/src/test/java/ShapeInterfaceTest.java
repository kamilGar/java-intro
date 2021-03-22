import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShapeInterfaceTest {

    Circle circle = new Circle(5);
    Rectangle rectangle = new Rectangle(2,3);

    @Test
    void shouldCalculateCircle() {
        double resultArea = circle.calculateArea();
        double resultPerimeter = circle.calculatePerimeter();
        Assertions.assertEquals(Math.PI*25, resultArea);
        Assertions.assertEquals(Math.PI*10, resultPerimeter);

    }

    @Test
    void shouldCalculateRectangle() {
        double resultArea = rectangle.calculateArea();
        double resultPerimeter = rectangle.calculatePerimeter();
        Assertions.assertEquals(6, resultArea);
        Assertions.assertEquals(10, resultPerimeter);

    }

}
