import static java.lang.Math.sqrt;

public class Triangle extends Shape {

    int sideA;
    int sideB;
    int sideC;
    int p;

    Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.p = (sideA+sideB+sideC)/2;
    }

    @Override
    double getArea() {
        return sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
    }

    @Override
    double getPerimeter() {
        return p*2;
    }
}
