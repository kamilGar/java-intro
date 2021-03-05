import java.util.Objects;

public class Person {

    String name;
    String surname;
    String birthDate;

    Person(String name, String surname, String birthDate) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof Person))
            return false;
        Person other = (Person)obj;

        boolean nameEquals = (this.name == null && other.name == null)
                || (this.name != null && this.name.equals(other.name));
        boolean surnameEquals = (this.surname == null && other.surname == null)
                || (this.surname != null && this.surname.equals(other.surname));
        boolean birthDateEquals = (this.birthDate == null && other.birthDate == null)
                || (this.birthDate != null && this.birthDate.equals(other.birthDate));

        return nameEquals && surnameEquals && birthDateEquals;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, birthDate);
    }

}