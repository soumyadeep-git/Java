import java.util.Scanner;

//This program will iterate/copy the array entered by the user and store it in another array

public class IteratingArray {
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

            System.out.println("Your cpied aray elemts are : " + arr[index]);
        }
    }
}
