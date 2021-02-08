public class EvenNumbersMain {
    public static void main (String[] args){
       System.out.println(isEven(1));
    }
    static String isEven(int x){
        if (x % 2==0)
            return "parzysta";
        else
            return "nieparzysta";
    }

}
