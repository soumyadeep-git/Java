import java.util.Scanner;

public class ArrayGrids {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of digits in a row: ");
        int numberOfDigit = input.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= numberOfDigit;) {
                System.out.print(numberOfDigit);
                j++;
            }

            System.out.println();
        }

    }
}
