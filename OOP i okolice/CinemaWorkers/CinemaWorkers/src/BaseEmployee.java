public abstract class BaseEmployee {

    protected String name;
    protected String surname;
    private static final int DEFAULT_BASE_SALARY = 3000;
    protected int yearOfEmployment;
    protected int baseSalary;

    BaseEmployee(String name, String surname, int yearOfEmployment) {
        this.yearOfEmployment = yearOfEmployment;
        this.baseSalary = DEFAULT_BASE_SALARY;
        this.name = name;
        this.surname = surname;
    }
    int getBaseSalary() {
        return baseSalary;
    }
    int getYearsOfEmployment() {
        return 2021 - yearOfEmployment;
    }
    abstract int calculateMonthlySalary();

}
