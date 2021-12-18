import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        int reverse = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the desired number ");
        int number = input.nextInt();
        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        System.out.println(reverse);
    }
}
