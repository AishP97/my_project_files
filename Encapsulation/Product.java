
package Encapsulation;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public void setName(String name){
        if(name == null || name == ""){
            System.out.println("Name cannot be null, Please enter a name");
        }else{
            this.name = name;
            System.out.println("NameSet");

        }
    }

    public void setPrice(double price){
        if(price < 0 ){
            System.out.println("Price cannot be negative");
        }else{
            this.price = price;
            System.out.println("PriceSet");
        }
    }

    public void setQuantity(int quantity){
        if(quantity < 0 ){
            System.out.println("Quantity cannot be negative");
        }else{
            this.quantity = quantity;
            System.out.println("QuanTITTYSet");

        }
    }

}
