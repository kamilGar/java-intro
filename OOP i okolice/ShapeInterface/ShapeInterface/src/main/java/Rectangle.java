public class Rectangle implements ShapeInterface {

    int sideA;
    int sideB;

    Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calculateArea() {
        return sideA*sideB;
    }

    @Override
    public double calculatePerimeter() {
        return (2*sideA)+(2*sideB);
    }
}
