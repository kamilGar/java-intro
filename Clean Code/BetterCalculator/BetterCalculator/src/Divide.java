public class Divide implements Calculator{

    @Override
    public double calculate(double number, double otherNumber) {
        if (otherNumber != 0) {
            return number/otherNumber;
        } else {
            throw new UnsupportedOperationException("Cannot divide by zero");
        }
    }

}
