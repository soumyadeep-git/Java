
// import java.util.Scanner;

// public class Armstrong {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter any number to check: ");
//         int num = input.nextInt();
//         while(num != 0){
//             num = 
//         }

//     }
// }
import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x, y, rem, n = 0;
        double r = 0.0;
        // x - denotes the input number
        // y - denotes the storage of original input number to check
        // rem - denotes the reminder
        // r - denotes the result variable

        System.out.println("-----Enter the integer number-----");
        x = in.nextInt();

        y = x;

        // store the number of digits of x in n
        for (y = x; y != 0; ++n) {
            y /= 10;
        }

        for (y = x; y != 0; y /= 10) {
            rem = y % 10;
            // store the sum of the power of individual digits in r
            r += Math.pow(rem, n);
        }

        // if x is equal to r, the number is an Armstrong number
        if ((int) r == x) {
            System.out.println("\n" + x + " is an Armstrong number.");
        } else {
            System.out.println("\n" + x + " is not an Armstrong number.");
        }
    }
}