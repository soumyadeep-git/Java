import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {

        int fact = 1;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number");

        int number = input.nextInt();

        for (int i = 1; i <= number; i++) {

            fact = fact * i;

        }

        System.out.println(fact);

    }

}