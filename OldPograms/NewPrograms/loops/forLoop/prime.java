import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        int temp = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer ");
        int num = input.nextInt();
        // if (num != 0) {
        // if (num /num == 1 && num/1=num) {
        // System.out.println("It's a prime number");
        // } else {
        // System.out.println("It's not a prime number");
        // }
        // } else {
        // System.out.println("you have entered zero");
        // }
        for (int count = 2; count <= num - 1; count++) {
            if (num % count == 0) {
                temp = temp + 1;
            }

        }
        if (temp == 0) {
            System.out.println("Prime");
        } else {
            System.out.println("Not a prime");
        }
    }
}
