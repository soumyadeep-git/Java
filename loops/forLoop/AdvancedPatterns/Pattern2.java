import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = input.nextInt();
        System.out.println("Enter the number of stars in a row");
        int noOfStars = input.nextInt();
        for (int countofRows = 1; countofRows <= rows; countofRows++) {
            for (int countOfStars = 1; countOfStars <= noOfStars; countOfStars++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
