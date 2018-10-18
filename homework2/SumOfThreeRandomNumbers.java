package lv.javaguru.homework2;

import java.util.Random;

public class SumOfThreeRandomNumbers {
    public static void main(String[] args) {

        //Method #1 - new Random()
        Random randomNumberGenerator = new Random();
        int firstRandomNumber = randomNumberGenerator.nextInt(101);
        int secondRandomNumber = randomNumberGenerator.nextInt(101);
        int thirdRandomNumber = randomNumberGenerator.nextInt(101);
        int sumOfRandomNumbers = firstRandomNumber + secondRandomNumber + thirdRandomNumber;
        System.out.println("Method 1 - new Random()");
        System.out.println("First number: " + firstRandomNumber);
        System.out.println("Second number: " + secondRandomNumber);
        System.out.println("Third number: " + thirdRandomNumber);
        System.out.println("Sum of random numbers: " + sumOfRandomNumbers + '\n');


        //Method #2 - Math.random()
        int firstRandomNumber2 = (int) (Math.random() * 101);
        int secondRandomNumber2 = (int) (Math.random() * 101);
        int thirdRandomNumber2 = (int) (Math.random() * 101);
        int sumOfRandomNumbers2 = firstRandomNumber2 + secondRandomNumber2 + thirdRandomNumber2;
        System.out.println("Method 2 - Math.random()");
        System.out.println("First number: " + firstRandomNumber2);
        System.out.println("Second number: " + secondRandomNumber2);
        System.out.println("Third number: " + thirdRandomNumber2);
        System.out.println("Sum of random numbers: " + sumOfRandomNumbers2);
    }
}
