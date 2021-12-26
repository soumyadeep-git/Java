
//We know that a prime number is only divisible by itself and one 
//so why is the logic not working. 
//Takes An argument as an integer an checks whether it is prime or not 

import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer : ");
        int num = input.nextInt();
        if (Checking(num)) {
            System.out.println("It's a prime ");
        }
    }

    public static boolean Checking(int number) {
        if (number % number == 0 && number % 1 == 0) { // I think an only if
                                                       // kind of statement will work
            return true;

        } else {
            return false;
        }
    }
}
