//This program will output the sum of even and odd numbers seperately
//Ex :-input : 12 23 2
//Output :- 14 and 23

import java.util.Scanner;

public class SumOfEven_odd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int evenSum = 0;
        int oddSum = 0;

        System.out.println("Enter the size");
        int size = input.nextInt();
        System.out.println("Enter the numbers");
        int number = input.nextInt();
        for (int counter = 0; counter < size; counter++) {
            if (number % 2 == 0) {
                evenSum = evenSum + number;
            }
            if (number % 2 != 0) {
                oddSum = oddSum + number;
            }
        }
        System.out.print("Sum of even numbers : " + evenSum);
        System.out.print("Sum of odd numbers : " + oddSum);
    }
    // int counter = 0;
    // while (counter < size) {
    // if (number % 2 == 0) {
    // evenSum = evenSum + number;

    // }
    // counter++;

}
