
import java.util.Scanner;

public class SumInARange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the lower limit: ");
        int lowerLimit = input.nextInt();
        System.out.print("Enter the upper limit: ");
        int upperLimit = input.nextInt();
        int evenChecker = 0;
        int sum = 0;

        while (evenChecker <= upperLimit && evenChecker >= lowerLimit) {

            if (evenChecker % 2 == 0) { // this will check whether the number is even or odd
                sum = sum + evenChecker;

            }
            evenChecker++; // it incereaments the variables in order to execute the next

        }
        System.out.println(sum);
    }
}
