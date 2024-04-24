package Encapsulation;

public class Person {
    
    private String firstname;
    private String lastname;

    public void setFirstName(String firstname){
        this.firstname = firstname;
    }

    public String getFirstName(){
        return firstname;
    }

    public void setLastName(String lastname){
        this.lastname = lastname;
    }
    public String getLastName(){
        return lastname;
    }
}
