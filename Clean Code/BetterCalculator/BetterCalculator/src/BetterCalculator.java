class BetterCalculator implements Calculator {

    @Override
    public double calculate(double number, double otherNumber, String operation) {
        switch (operation) {
            case "+":
                return number + otherNumber;
            case "-":
                return number - otherNumber;
            case "*":
                return number * otherNumber;
            case "/":
                if (otherNumber != 0) {
                    return number / otherNumber;
                } else {
                    throw new UnsupportedOperationException("Cannot divide by zero!");
                }
        }
        return 0;
    }

}
