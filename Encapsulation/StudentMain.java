package Encapsulation;

public class StudentMain {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Anami");
        s.setAge(16);

        System.out.println("Name of the Student : " + s.getName());
        System.out.println("Age of Student is " + s.getAge());

    }
}
