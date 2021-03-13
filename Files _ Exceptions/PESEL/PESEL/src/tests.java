public class tests {

    public static void main(String[] args) {

        PeselValidator pesel1 = new PeselValidator("99022283413");
        PeselValidator pesel2 = new PeselValidator("990235123");
        PeselValidator pesel3 = new PeselValidator("31748waw973");

        System.out.println(pesel1.IsValid());
        // System.out.println(pesel2.checkPESEL());
        System.out.println(pesel3.IsValid());

    }

}
