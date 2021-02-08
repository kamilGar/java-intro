
class Age {

    public static void main(String[] args) {

        System.out.println(CheckAge(33));
    }

    static String CheckAge(int age) {
        if (age >= 18) {
            return "pelnoletni";
        }
        else {
            return "niepelnoletni";
        }
    }
}
