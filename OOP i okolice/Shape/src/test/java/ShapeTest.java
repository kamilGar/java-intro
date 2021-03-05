import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShapeTest {

    Square square = new Square(3, 3);
    Triangle triangle = new Triangle(3, 4,5);
    Circle circle = new Circle(4);
    Rectangle rectangle = new Rectangle(5, 6);

    @Test
    void shouldCalculateSquare() {
        double resultArea = square.getArea();
        double resultPerimeter = square.getPerimeter();
        Assertions.assertEquals(9, resultArea);
        Assertions.assertEquals(12, resultPerimeter);
    }
    @Test
    void shouldCalculateTriangle() {
        double resultArea = triangle.getArea();
        double resultPerimeter = triangle.getPerimeter();
        Assertions.assertEquals(6, resultArea);
        Assertions.assertEquals(12, resultPerimeter);
    }
    @Test
    void shouldCalculateCircle() {
        double resultArea = circle.getArea();
        double resultPerimeter = circle.getPerimeter();
        Assertions.assertEquals(Math.PI*16, resultArea);
        Assertions.assertEquals(Math.PI*8, resultPerimeter);
    }
    @Test
    void shouldCalculateRectangle() {
        double resultArea = rectangle.getArea();
        double resultPerimeter = rectangle.getPerimeter();
        Assertions.assertEquals(30, resultArea);
        Assertions.assertEquals(22, resultPerimeter);
    }
}
