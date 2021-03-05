public class ShowBillValues {

    public static void main(String[] args) {
        System.out.println("Wartość rachunku: "+BillCalculator.calculate(2000,50)+"zł");
        System.out.println("Wartość rachunku: "+BillCalculator.calculate(2000,50,10)+"zł");
        System.out.println("Wartość rachunku: "+BillCalculator.calculate(2000,50,10,15)+"zł");
    }

}

