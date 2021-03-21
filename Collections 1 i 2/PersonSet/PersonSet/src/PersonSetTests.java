import java.util.*;

public class PersonSetTests {

    public static void main(String[] args) {

        Set<Person> peopleByAge = new TreeSet<Person>(Comparator.comparing(Person::getBirthYear).reversed());
        peopleByAge.add(new Person("name1", "surname1", 1999, 160, 59));
        peopleByAge.add(new Person("name2", "surname2", 1995, 190, 79));
        peopleByAge.add(new Person("name3", "surname3", 2002, 175, 65));
        peopleByAge.add(new Person("name4", "surname4", 1967, 165, 100));

        System.out.println("\nOsoby od najmłodszej do najstarszej:");
        for (Person person : peopleByAge) {
            System.out.println(person);

        }
        Set<Person> peopleByHeight = new TreeSet<Person>(Comparator.comparing(Person::getHeight));
        peopleByHeight.addAll(peopleByAge);
        System.out.println("\nOsoby od najniższej do najwyższej:");
        for (Person person : peopleByHeight) {
            System.out.println(person);

        }
        Set<Person> peopleByWeight = new TreeSet<Person>(Comparator.comparing(Person::getWeight).reversed());
        peopleByWeight.addAll(peopleByAge);
        System.out.println("\nOsoby od najcięższej do najlżejszej:");
        for (Person person : peopleByWeight) {
            System.out.println(person);

        }
    }
}
