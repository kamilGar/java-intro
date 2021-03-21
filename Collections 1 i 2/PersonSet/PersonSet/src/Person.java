
public class Person  implements Comparable<Person> {

    String name;
    String surname;
    int birthYear;
    int height;
    int weight;

    public Person(String name, String surname, int birthYear, int height, int weight) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(birthYear, o.birthYear);
    }

    @Override
    public String toString() {
        return "Person{" +
                "birthYear=" + birthYear +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public double getBirthYear() {
        return birthYear;
    }
}
