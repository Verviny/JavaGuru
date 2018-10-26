package lv.javaguru.homework3;

public class CarTest {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setModel("Peugeot");
        myCar.setColor("White");
        myCar.setYear(2018);
        System.out.println("My car model: " + myCar.getModel());
        System.out.println("My car color: " + myCar.getColor());
        System.out.println("My car year: " + myCar.getYear());
    }
}
