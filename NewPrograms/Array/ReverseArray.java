
//Given an unsorted array arr[] of size N, rotate it by D elements (clockwise). 
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = { 2, 45, 1, 5 };
        Arrays.sort(arr);

        for (int index = arr.length - 1; index >= 0; index--) {
            System.out.println(arr[index]);
        }

    }
}
