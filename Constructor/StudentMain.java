public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student("Amod");
        Student s2 = new Student(30, 7.60);
        Student s3 = new Student("Ash", 27, 7.7);
    
        System.out.println(s1.getName());
        System.out.println(s2.getAge() + " " + s2.getGrade());
        System.out.println(s3.getName()+ " " + s3.getAge() +  " "+ s3.getGrade());
    }
    
}
