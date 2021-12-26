
//Write a method named isEven that accepts an int argument. The method should return true if the argument 
//is even, or false otherwise.
// Also write a program to test your method.
import java.util.Scanner;

public class EvenCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = input.nextInt();
        if (IsEven(num)) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

    }

    public static boolean IsEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }
}
