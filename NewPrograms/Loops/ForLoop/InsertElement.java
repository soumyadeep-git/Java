//This program will help the user to insert an element in the desired index of the array

import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = input.nextInt();
        int arr[] = new int[100];
        System.out.println("Enter the elements : ");
        for (int index = 0; index < size; index++) {
            arr[index] = input.nextInt();

        }
        for (int index = 0; index < size; index++) {
            arr[index] = input.nextInt();
            // int putter = 0;
            System.out.println("Enter the index you want to search : ");
            int finder = input.nextInt();
            finder = arr[finder];
            System.out.println(finder);
        }

    }
}
