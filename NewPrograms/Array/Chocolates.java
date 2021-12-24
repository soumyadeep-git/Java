
// As we know, Ishaan has a love for chocolates. He has bought a huge chocolate bar that contains N chocolate squares. Each of the squares has a tastiness level which is denoted by an array A[].
// Ishaan can eat the first or the last square of the chocolate at once. Ishaan has a sister who loves chocolates too and she demands the last chocolate square. Now, Ishaan being greedy eats the more tasty square first. 
// Determine the tastiness level of the square which his sister gets.
import java.util.Scanner;
import java.util.Arrays;

public class Chocolates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = input.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the elements");
        for (int index = 0; index < size; index++) {
            arr[index] = input.nextInt();

        }
        System.out.println("Array : ");
        for (int index = 0; index < size; index++) {

            System.out.println(arr[index]);
            // Arrays.sort(arr);
            // System.out.println(arr);

        }

    //     System.out.println("Your Sorted elemets are : ");
    //     for (int element : arr) {

    //         System.out.println(element);

    //     }

    // }
}