
//Checks if a number is pallindrome or not
import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a integer : ");
        int num = input.nextInt();
        if (isPallindrome(num)) {
            System.out.println(num + " is pallindrome");
        } else {
            System.out.println("Not a pallindrome");
        }
    }

    public static boolean isPallindrome(int number) {
        int temp = number;
        int remainder = 0;
        int reverse = 0;
        while (temp > 0) {
            remainder = temp % 10;
            temp = temp / 10;
            reverse = reverse * 10 + remainder;
        }
        return reverse == number;
    }
}
