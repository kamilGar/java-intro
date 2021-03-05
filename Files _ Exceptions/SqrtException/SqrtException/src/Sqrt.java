class Sqrt {

    static double sqrt(int number) {
        double result;
        if (number > 0) {
            result = Math.sqrt(number);
        } else {
            throw new IllegalArgumentException("Please, enter a positive number");
        }
        return result;
    }

}
