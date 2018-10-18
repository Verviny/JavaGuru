package lv.javaguru.homework2;

public class MathOperationsHomework {
    public static void main(String[] args) {
        int amountOfBooks = 250;
        int amountOfCustomers = 178;
        int amountOfPagesPerBook = 250;
        float amountOfBooksPerCustomer = (float) amountOfBooks / amountOfCustomers;
        int totalAmountOfPages = amountOfPagesPerBook * amountOfBooks;
        System.out.println("Average amount of books per customer: " + amountOfBooksPerCustomer);
        System.out.println("Total amount of pages: " + totalAmountOfPages);

        byte applesInFirstBag = 15;
        byte applesInSecondBag = 28;
        float eatenApples = 3.356f;
        int amountOfWholeApplesLeft = (int) (applesInFirstBag + applesInSecondBag - eatenApples);
        System.out.println("Amount of WHOLE apples left: " + amountOfWholeApplesLeft);
    }
}
