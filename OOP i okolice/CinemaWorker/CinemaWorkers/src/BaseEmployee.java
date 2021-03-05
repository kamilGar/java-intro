public abstract class BaseEmployee {

    String name;
    String surname;
    final int defaultBaseSalary = 3000;
    int yearOfEmployment;
    int baseSalary;

    // constructor
    BaseEmployee(String name, String surname, int yearOfEmployment) {
        this.yearOfEmployment = yearOfEmployment;
        this.baseSalary = defaultBaseSalary;
        this.name = name;
        this.surname = surname;
    }
    // methods
    int getBaseSalary() {
        return baseSalary;
    }
    int getYearsOfEmployment() {
        return 2021 - yearOfEmployment;
    }
    abstract int calculateMonthlySalary();

}
