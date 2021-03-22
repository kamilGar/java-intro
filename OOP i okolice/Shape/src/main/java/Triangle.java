import static java.lang.Math.sqrt;

public class Triangle extends Shape {
    int a;
    int b;
    int c;
    int halfPerimeter;
    Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.halfPerimeter = (a+b+c)/2;
    }
    @Override
    double getArea() {
        return sqrt(halfPerimeter*(halfPerimeter-a)*(halfPerimeter-b)*(halfPerimeter-c));
    }

    @Override
    double getPerimeter() {
        return halfPerimeter*2;
    }
}
