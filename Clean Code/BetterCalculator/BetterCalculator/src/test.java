public class test {

    public static void main(String[] args) {

        System.out.println(new Add().calculate(2.5,4));
        System.out.println(new Subtract().calculate(5,4));
        System.out.println(new Multiple().calculate(5,2));
        System.out.println(new Divide().calculate(22,4.4));
        System.out.println(new Divide().calculate(6,0));
    }

}
