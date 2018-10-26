package lv.javaguru.homework3;

public class CircleTest {
    public static void main(String[] args) {
        Circle myCircle = new Circle();
        myCircle.setRadius(5.5);
        System.out.println("My circle radius: " + myCircle.getRadius());
        System.out.println("My circle area: " + myCircle.calculateArea());
    }
}
