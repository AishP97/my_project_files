public class Student {
    
    String name;
    int age;
    double grade;

    
    Student(String name){
        this.name = name;
    }

    Student(int age, double grade){
        this.age = age;
        this.grade = grade;
    }

    Student(String name, int age, double grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    

    

}
