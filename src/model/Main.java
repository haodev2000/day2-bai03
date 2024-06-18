package model;

public class Main {
    public static void main(String[] args) {
        Employee manager = new Manager();
        Employee developer = new Developer();
        Employee programmer = new Programmer();

        // Manager
        manager.setName("Avril Aroldo");
        manager.setPerormance("Excellent");
        manager.setPosition("Manager's");
        manager.setType("managing a project");
        manager.setSalary(12000);

        // Developer
        developer.setName("Iver Dipali");
        developer.setPerormance("Good");
        developer.setPosition("Developer's");
        developer.setType("wirtting code in Java");
        developer.setSalary(7200);

        // Programmer
        programmer.setName("Yaron Gabriel");
        programmer.setPerormance("Excellent");
        programmer.setPosition("Programmer's");
        programmer.setType("debugging code in java");
        programmer.setSalary(9120);




        System.out.println(manager.getPosition() + " Bonus: " + "$" + manager.getSalary());
        System.out.println(developer.getPosition() + " Bonus: " + "$" + developer.getSalary());
        System.out.println(programmer.getPosition() + " Bonus: " + "$" + programmer.getSalary());

        System.out.println("Performance report for " + manager.getPosition() + " " + manager.getName() + ": " + manager.getPerormance());
        System.out.println("Performance report for " + developer.getPosition() + " " + developer.getName() + ": " + developer.getPerormance());
        System.out.println("Performance report for " + programmer.getPosition() + " " + programmer.getName() + ": " + programmer.getPerormance());

        System.out.println(manager.getPosition() + " " + manager.getName() + " " + manager.getType());
        System.out.println(developer.getPosition() + " " + developer.getName() + " " + developer.getType());
        System.out.println(programmer.getPosition() + " " + programmer.getName() + " " + programmer.getType());

    }
}
