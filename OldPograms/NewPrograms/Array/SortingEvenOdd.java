import java.util.Scanner;

public class SortingEvenOdd {
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
        int evenElements = 0;
        for (int index = 0; index < size; index++) {
            System.out.println(arr[index]); // this will print the elements
            if(arr[index]%2 = 0){
                evenElements = arr[index];
                System.out.println(evenElements);
            }
        }
       
    }
}