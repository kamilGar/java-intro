public class tests {

    public static void main(String[] args) {

        PESEL pesel = new PESEL("99022283413");
        PESEL pesel2 = new PESEL("990235123");
        PESEL pesel3 = new PESEL("31748waw973");

        System.out.println(pesel.checkPESEL());
        // System.out.println(pesel2.checkPESEL());
        System.out.println(pesel3.checkPESEL());

    }

}
