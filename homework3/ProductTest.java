package lv.javaguru.homework3;

public class ProductTest {
    public static void main(String[] args) {
        Product myProduct = new Product();
        myProduct.setName("milk");
        myProduct.setRegularPrice(4.44);
        myProduct.setDiscount(0.25);
        myProduct.print();
    }
}
