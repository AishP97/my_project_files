public class CarMain {
    public static void main(String[] args) {
        Car c1 = new Car("Honda", "V17", "2015", "Black");
        Car c2 = new Car("Toyota","Z30","2010");

       System.out.println(c1.getModel()+ " "+ c1.getMake() + " "+ c1.getColor() + " "+ c1.getYear());
       c2.characteristics("Toyota", "Z30", "2000");
    }

    
}
