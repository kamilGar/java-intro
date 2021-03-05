public class Pitagoras {

    static boolean checkIfRectangular(int a, int b, int c) {

        boolean result;

        if (a>b && a>c) {
            result = b*b + c*c == a*a;
        } else if (b>a && b>c) {
            result = a*a + c*c == b*b;
        } else {
            result = a*a + b*b == c*c;
        }
        return result;
    }

}
