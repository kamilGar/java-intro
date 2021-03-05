public class Manager extends BaseEmployee {

    final int baseSalaryManager = 5000;
    int bonus = 500;

    Manager(String name, String surname, int yearOfEmployment) {
        super(name, surname, yearOfEmployment);
        this.baseSalary = baseSalaryManager;
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
