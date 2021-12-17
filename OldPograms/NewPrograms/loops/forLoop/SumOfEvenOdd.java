//This program will output the sum of even and odd numbers seperately
//Ex :-input : 12 23 2
//Output :- 14 and 23

import java.util.Scanner;

import javax.swing.InputMap;

public class SumOfEvenOdd {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        int evenSum = 0;
        int oddSum = 0;
        int inputs[] = InputManager.getNumbers();

        for (int counter = 0; counter < inputs.length; counter++) {
            int number = inputs[counter];
            if (number % 2 == 0) {
                evenSum = evenSum + number;
            }
            if (number % 2 != 0) {
                oddSum = oddSum + number;
            }

        }
        System.out.println("Sum of even numbers : " + evenSum);
        System.out.println("Sum of odd numbers : " + oddSum);
        // int counter = 0;
        // while (counter < size) {
        // if (number % 2 == 0) {
        // evenSum = evenSum + number;

        // }
        // counter++;

    }
}
