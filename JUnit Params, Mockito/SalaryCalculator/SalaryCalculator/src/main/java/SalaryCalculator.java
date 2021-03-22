public class SalaryCalculator implements SaturdayBonus,BaseSalary {

    int baseSalary;
    int bonus;
    int saturdayBonus;
    int howManySaturdays;

    SalaryCalculator(int baseSalary, int bonus, int saturdayBonus, int howManySaturdays) {
        this.baseSalary = baseSalary;
        this.bonus = bonus;
        this.saturdayBonus = saturdayBonus;
        this.howManySaturdays = howManySaturdays;
    }

    @Override
    public int getBaseSalary() {
        return baseSalary;
    }

    @Override
    public int getSaturdayBonus() {
        return saturdayBonus;
    }

    int calculateSalary() {
        return baseSalary + bonus + (saturdayBonus * howManySaturdays);
    }

}
