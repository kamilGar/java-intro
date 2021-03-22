public class CinemaWorkersTesty {
    public static void main(String[] args) {
        TicketSeller ticketSeller = new TicketSeller("Natalia","Karczewska",2009);
        Manager manager = new Manager("Kamil","Garbaczewski",2011);

        System.out.println(manager.getBaseSalary() + " zł");
        System.out.println(ticketSeller.getBaseSalary() + " zł");

        System.out.println(ticketSeller.getYearsOfEmployment() + " lat");
        System.out.println(manager.getYearsOfEmployment() + " lat");

        System.out.println(manager.calculateMonthlySalary() + " zł");
        manager.changeBonus(1500);
        System.out.println(manager.calculateMonthlySalary() + " zł");
        System.out.println(ticketSeller.calculateMonthlySalary() + " zł");
    }
}