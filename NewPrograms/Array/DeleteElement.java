
//This program will delete an element from an array
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = input.nextInt();
        System.out.println("Enter the array elemets : ");
        // int elements = input.nextInt();
        int arr[] = new int[100];

        for (int index = 0; index < size; index++) {
            arr[index] = input.nextInt(); // storing the values of the array

            // if()
        }
        System.out.println("Your array is : ");
        for (int index = 0; index < size; index++) {

            System.out.println(arr[index]);

        }
        System.out.println("Enter the number you want to delete : ");
        int num = input.nextInt();
        if(arr[index])
    }
}
