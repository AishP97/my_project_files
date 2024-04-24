public class Car{
    String make;
    String model;
    String year;
    String color;

    Car(String make, String model, String year, String color){
        this.model = model;
        this.make = make;
        this.year = year;
        this.color = color;

    }

    Car(String make, String model, String year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void characteristics(String make, String model, String year){
        System.out.println(make + " " + model + "   "+ year);
    }
    

}