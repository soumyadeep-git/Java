//This programs will find the second largest element in the array

import java.util.Scanner;

import javax.swing.SizeSequence;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = input.nextInt();
        System.out.println("Enter the elements in the array");
        int arr[] = new int[100];
        for (int index = 0; index < size; index++) {
            arr[index] = input.nextInt(); // this places all the elments in the indexes of the array

        }
        System.out.print("The elements in your array are : ");
        for (int index = 0; index < size; index++) {
            System.out.println(arr[index]); // this will print the elements
        }
        int temp = 0;
        for (int index = 0; index < size; index++) {
            for (int subIndex = index + 1; subIndex < size; subIndex++) {
                if (arr[index] < arr[subIndex]) {
                    temp = arr[subIndex]; // this will store the second largest element in temp
                    System.out.println("You second largest element is :" + temp);
                }
            }
        }

    }

}
