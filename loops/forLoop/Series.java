// import java.util.Scanner;

// public class Series {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int series = 0;
//         System.out.println("Ente upto how many numbers you want to input");
//         int upperLimit = input.nextInt();
//         for (int denominator = 1; denominator <= upperLimit; denominator++) {
//             series = series + 1 / denominator;

//         }
//         System.out.println("Your series is " + series);
//     }
// }
import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int number; // To hold number of terms

        double sum = 0;

        System.out.print("Enter number of terms of series : ");
        number = console.nextInt();

        for (int i = 1; i <= number; i++) {
            sum += 1.0 / i;
             System.out.println("sum: " + sum);
        }

       
    }
}
