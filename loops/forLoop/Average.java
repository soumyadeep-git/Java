// import java.util.Scanner;

// public class average {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter q to quit");
//     }
// }
//Java Program to find the Factorial of a Number
import java.util.*;

public class Average {// #endregion{
    public static void main(String[] args) {
        // Take input from the user
        // Create an instance of the Scanner Class
        Scanner sc = new Scanner(System.in);
        // Declare and Initialize the variable
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int i = 1, fact = 1;
        while (i <= num) {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of the number: " + fact);
    }
}