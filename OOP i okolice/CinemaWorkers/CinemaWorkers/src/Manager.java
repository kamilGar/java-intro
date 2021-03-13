public class Manager extends BaseEmployee {

    private static final int BASE_SALARY_MANAGER = 5000;
    protected int bonus = 500;

    Manager(String name, String surname, int yearOfEmployment) {
        super(name, surname, yearOfEmployment);
        this.baseSalary = BASE_SALARY_MANAGER;
    }

    void changeBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    int getBaseSalary() {
        return baseSalary;
    }

    @Override
    int calculateMonthlySalary() {
        return baseSalary + bonus;
    }

}
