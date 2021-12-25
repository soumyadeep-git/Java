//Will check if a given number belongs to the fibonacci series

import java.util.Scanner;

public class CheckFibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter positive number :");

        int inputNumber = input.nextInt();

        int firstTerm = 0;

        int secondTerm = 1;

        int thirdTerm = 0;

        while (thirdTerm < inputNumber) {
            thirdTerm = firstTerm + secondTerm;

            firstTerm = secondTerm;

            secondTerm = thirdTerm;
        }

        if (thirdTerm == inputNumber) {
            System.out.println("Number belongs to Fibonacci series");
        } else {
            System.out.println("Number doesn't belongs to Fibonacci series");
        }
    }
}