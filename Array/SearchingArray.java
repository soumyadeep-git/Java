//This program serves two purposes
// 1. Take user input in an array and then print the array
// 2. Find whether a specific element is present in the array

import java.util.Scanner;

public class SearchingArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = input.nextInt();
        System.out.println("Enter the elements of the array");

        int arr[] = new int[100];
        for (int index = 0; index < size; index++) {
            arr[index] = input.nextInt(); // this places all the elments in the indexes of the array

        }
        System.out.print("The elements in your array are : ");
        for (int index = 0; index < size; index++) {
            System.out.println(arr[index]); // this will print the elements
        }
        boolean finder = false;
        for (int index = 0; index < size; index++) {
            System.out.println("Enter the number you want to find : ");
            int number = input.nextInt();
            // int index = 0;
            if (arr[index] == number) { // this will search whether the desired element is present or not
                finder = true;
                System.out.println(finder);
            }

        }

    }
}
