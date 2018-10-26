package lv.javaguru.homework3;

import java.text.DecimalFormat;

public class Product {
    private String name;
    private double regularPrice;
    private double discount;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double newRegularPrice) {
        this.regularPrice = newRegularPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double newDiscount) {
        this.discount = newDiscount;
    }

    public double calculateActualPrice(double regularPrice, double discount) {
        double actualPriceResult = regularPrice - (regularPrice * discount);
        return actualPriceResult;
    }

    void print() {
        DecimalFormat formatInDecimal = new DecimalFormat("0.00");
        DecimalFormat formatPercentages = new DecimalFormat("#%");
        System.out.println("Product: name = " + getName() + ", regular price = " + getRegularPrice() + " EUR, discount = " + formatPercentages.format(getDiscount()) + ", actual price = " + formatInDecimal.format(calculateActualPrice(regularPrice, discount)) + " EUR");
    }
}
