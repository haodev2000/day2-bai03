package model;

public class Employee {

    private String name;
    private String type;
    private double salary;
    private String position;
    private String perormance;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPerormance() {
        return perormance;
    }

    public void setPerormance(String perormance) {
        this.perormance = perormance;
    }
}
