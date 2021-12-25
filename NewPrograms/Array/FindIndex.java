
//Given a sorted array of size N and an integer K, 
//find the position at which K is present in the array using binary search.
import java.util.Scanner;

public class FindIndex {
    public static void main(String[] args) {
        int arr[] = { 2, 34, 44, 1 };
        // Scanner input = new Scanner(System.in);
        // System.out.println("Enter the number you want to find");
        // int finder = input.nextInt();
        int finder = 0;
        for (int index : arr) {
            // arr = arr[index];
            System.out.println(index);
            finder = index;
            // System.out.println("Array" + finder);
        }
        if (finder == 2) {
            System.out.println("Present");
        } else {
            System.out.println("not");
        }
    }
}
