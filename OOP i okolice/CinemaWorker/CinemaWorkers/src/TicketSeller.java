public class TicketSeller extends BaseEmployee {

    TicketSeller(String name, String surname, int yearOfEmployment) {
        super(name, surname, yearOfEmployment);
    }

    @Override
    int calculateMonthlySalary() {
        return baseSalary;
    }

}
