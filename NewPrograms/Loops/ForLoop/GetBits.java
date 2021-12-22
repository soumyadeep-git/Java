
//Given a positive integer N, print count of set bits in it. 
// Explanation:
// Binary representation is '110' 
// So the count of the set bit is 2.
import java.util.Scanner;

public class GetBits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the whole number you want to convert");
        int num = input.nextInt();
        int index;
        int noOfBits = 0;
        // int remainder = 0;
        int result[] = new int[100];
        for (index = 0; num > 0; index++) {
            result[index] = num % 2; // Storing the remainder
            num = num / 2; // will go on until num is > 0
        }
        for (int index1 = index - 1; index1 >= 0; index1--) {// Printing the value backwards
            System.out.println(result[index1]);
            if (result[index1] == 1) {
                noOfBits = noOfBits + 1;

            }
        }
        System.out.println("Number of bits : " + noOfBits);

    }
}
