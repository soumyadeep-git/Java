import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char choice;
        do {
            System.out.print("Enter the first number ");
            int number1 = input.nextInt();

            System.out.print("Enter the second number ");
            int number2 = input.nextInt();

            int sum = number1 + number2;

            System.out.print("Do you wish to continue y/n ? ");
            choice = input.next().charAt(0);
            System.out.println("Sum = " + sum);
            System.out.println();
        } while (choice == 'y' || choice == 'Y');

    }
}
