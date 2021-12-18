//This program serves two purposes
// 1. Take user input in an array and then print the array
// 2. Calculate the average if the array elements

import java.util.Scanner;

public class AverageArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int numOfArray = input.nextInt();
        int arr[] = new int[1000];
        int resultAverage = 0;
        System.out.print("Enter the elements in the array : ");
        for (int i = 0; i < numOfArray; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("The elements of your array are: ");
        for (int i = 0; i < numOfArray; i++) {
            System.out.println(arr[i]);
            resultAverage = resultAverage + arr[i];

        }
        System.out.print("The average of your array elements is :" + resultAverage / numOfArray);

    }
}
