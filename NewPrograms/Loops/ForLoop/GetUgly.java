//Ugly numbers are numbers whose only prime factors are 2, 3 or 5.
// The sequence 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15, … shows the first 11 ugly numbers.
// By convention, 1 is included. Write a program to find Nth Ugly Number.

import java.util.Scanner;

public class GetUgly {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The upper limit");
        int upperLimit = input.nextInt();
        int result = 1;
        for (int index = 1; index <= upperLimit; index++) {
            if (index % 2 == 0 || index % 5 == 0 || index % 3 == 0) {
                result = index;

            }

            System.out.println(result);
        }
    }
}
