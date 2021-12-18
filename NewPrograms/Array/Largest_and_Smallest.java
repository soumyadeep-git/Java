//This program will display the smallest and largest number entere by the user

import java.util.Scanner;

public class Largest_and_Smallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter how many numbers you want to input : ");
        int size = input.nextInt();
        System.err.println("Enter the elements of the array : ");
        int arr[] = new int[100];
        int max = 0;
        int min = 100;
        for (int counter = 0; counter < size; counter++) {
            arr[counter] = input.nextInt();
            if (max < arr[counter]) {
                max = arr[counter];
            }
            if (min > arr[counter]) {
                min = arr[counter];
            }

        }
        System.out.println("Your maximum element is : " + max);
        System.out.println("Your minimum element is : " + min);
    }
}
