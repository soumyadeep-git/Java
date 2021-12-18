//This program will give the sum of n numbers entered by the user

import java.util.Scanner;

public class NSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the how many numbers you want to input");
        int size = input.nextInt();
        System.out.println("Enter the numbers you want to input");
        int numbers = input.nextInt();
        int sum = 0;
        for (int counter = 0; counter < size; counter++) {
            sum = sum + counter;
        }
        System.out.println(sum);
    }
}
