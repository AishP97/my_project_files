package Encapsulation;

public class PersonMain {
    
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setFirstName("Adhira");
        p1.setLastName("Sutar");

        System.out.println(p1.getFirstName() + " " + p1.getLastName());
    }
}
