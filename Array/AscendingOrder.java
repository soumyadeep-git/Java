//This program will sort the array in ascending order

import java.util.Scanner;

public class AscendingOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = input.nextInt();
        System.out.println("Enter the elements in the array");
        int arr[] = new int[100];
        for (int index = 0; index < size; index++) {
            arr[index] = input.nextInt(); // this places all the elments in the indexes of the array

        }
        int temp = 0;
        for (int index = 0; index < size; index++) {
            for (int subIndex = index + 1; subIndex < size; subIndex++) {
                if (arr[index] < arr[subIndex]) {
                    temp = arr[subIndex]; // this will store the second largest element in temp
                    arr[index] = arr[subIndex];
                    arr[subIndex] = arr[index];
                    // System.out.println("You second largest element is :" + arr[index]);
                    System.out.println(temp);
                }
            }

        }
    }
}
