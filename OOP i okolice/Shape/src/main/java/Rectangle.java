public class Rectangle extends Shape {

    int a;
    int b;

    Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double getArea() {
        return a*b;
    }

    @Override
    double getPerimeter() {
        return a+a+b+b;
    }
}
