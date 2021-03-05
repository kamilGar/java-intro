public class Circle implements ShapeInterface {

    double pi = Math.PI;
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return pi*radius*radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2*pi*radius;
    }
}