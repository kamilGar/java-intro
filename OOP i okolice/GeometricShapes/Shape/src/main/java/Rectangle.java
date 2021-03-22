public class Rectangle extends Shape {

    int sideA;
    int sideB;

    Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    double getArea() {
        return sideA*sideB;
    }

    @Override
    double getPerimeter() {
        return (2*sideA)+(2*sideB);
    }
}
