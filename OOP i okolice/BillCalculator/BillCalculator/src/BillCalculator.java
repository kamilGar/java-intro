public class BillCalculator {

    public static int calculate(int billValue, int serviceFee) {
        return billValue + serviceFee;
    }

    public static int calculate(int billValue, int serviceFee, int discount) {
        return billValue + serviceFee - discount;
    }

    public static int calculate(int billValue, int serviceFee, int discount, int packageCost) {
        return billValue + serviceFee + packageCost - discount;
    }

}
