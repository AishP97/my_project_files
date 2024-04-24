package Encapsulation;

public class Employee {
    private String name;
    private double salary;

    Employee(String name){
        this.name = name;      
    }

    public void setSalary(double salary){
        this.salary = salary;
        System.out.println("Salary value stored !!");
    }

    public String getName(){
        return name;
    }

}
