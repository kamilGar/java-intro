class BetterCalculator {

    protected static double add(double number, double otherNumber) {
        return number + otherNumber;
    }

    protected static double sub(double number, double otherNumber) {
        return number - otherNumber;
    }

    protected static double mul(double number, double otherNumber) {
        return number * otherNumber;
    }

    protected static double divide(double number, double otherNumber) {
        double result;
        if (otherNumber != 0) {
            result = number / otherNumber;
        } else {
            throw new UnsupportedOperationException("Cannot divide by zero");
        }
        return result;
    }

}
