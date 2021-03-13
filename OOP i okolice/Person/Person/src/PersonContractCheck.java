public class PersonContractCheck {

    public static void main(String[] args) {

        Person person1 = new Person("Kamil", "Garbaczewski", "22/02/1999");
        Person person2 = new Person("Kamil", "Garbaczewski", "22/02/1999");

        System.out.println(person1.equals(person1)); // zwrotność (exp: true)

        System.out.println(person1.equals(person2)); // symetria (exp: true true)
        System.out.println(person2.equals(person1));

        System.out.println(person2.equals(null)); // wynik porównania z null (exp: false)

        System.out.println(person1.hashCode() == person2.hashCode()); // (exp: true)

        System.out.println(person2.hashCode()); // (exp: ten sam hashCode)
        System.out.println(person1.hashCode());
    }

}
