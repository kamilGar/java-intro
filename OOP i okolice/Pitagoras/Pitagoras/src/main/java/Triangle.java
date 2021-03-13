public class Triangle {

    protected boolean checkIfRectangular(int a, int b, int c) {

        if (a>b && a>c) {
            return b*b + c*c == a*a;
        } else if (b>a && b>c) {
            return a*a + c*c == b*b;
        } else {
            return a*a + b*b == c*c;
        }

    }

}
