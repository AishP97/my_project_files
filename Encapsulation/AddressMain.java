package Encapsulation;

public class AddressMain {
    public static void main(String[] args) {
        Address ad = new Address("202 Bowers St", "Jersey City", "New Jersey", 07307);
        System.out.println("Street Name :" + ad.getStreet());
        System.out.println("City Name :" + ad.getCity());
        System.out.println("State Name :" + ad.getState());
        System.out.println("Zipcode :" + ad.getZipcode());
    }
    
}
