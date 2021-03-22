public class Circle extends Shape {

    double pi = Math.PI;
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return pi*radius*radius;
    }

    @Override
    double getPerimeter() {
        return 2*pi*radius;
    }
}
