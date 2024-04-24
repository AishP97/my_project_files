package Encapsulation;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setLength(5.5);
        r1.setWidth(4.6);

        double area = r1.getLength() * r1.getWidth();
        System.out.println(area);
    }
}
