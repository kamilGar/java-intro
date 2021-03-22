class NumberChecker {

    static boolean checkIfEven(int number) {
        if (number%2 == 0) {
            return true;
        }
        return false;
    }

    static int calculateSumOfDigits(int number) {
        int temp,sum = 0;
        while(number > 0)
        {
            temp = number % 10;
            sum = sum + temp;
            number = number / 10;
        }
        return sum;
    }

}
