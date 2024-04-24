package Encapsulation;

public class Address {
    private String street;
    private String city;
    private String state;
    private int zipcode;

    Address(String street,String city, String state,int zipcode){
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public String getStreet(){
        return street;
    }

    public String getCity(){
        return city;
    }

    public String getState(){
        return state;
    }

    public int getZipcode(){
        return zipcode;
    }
}
