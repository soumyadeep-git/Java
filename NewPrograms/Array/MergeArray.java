//Given two sorted arrays arr1[] of size N and arr2[] of size M. Each array is sorted in non-decreasing order. Merge the two arrays into one sorted array in non-decreasing order without using any extra space.

public class MergeArray {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5 };
        int arr2[] = { 6, 7, 8, 9, 10, 1122, 3333 };
        int arr1_size = arr1.length;
        int arr2_size = arr2.length;
        int resultantSize = arr1_size + arr2_size;
        int resultantArray[] = new int[resultantSize];

        for (int index = 0; index < arr1.length; index++) {
            resultantArray[index] = arr1[index];
        }
        for (int index = 0; index < arr2.length; index++) {
            resultantArray[arr1_size + index] = arr2[index];
        }
        for (int index = 0; index < resultantArray.length; index++) {
            System.out.println(resultantArray[index]);
        }
    }
}
