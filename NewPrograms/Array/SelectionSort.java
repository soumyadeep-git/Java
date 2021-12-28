
public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = { 1, 22, 32, 2 };
        // Selection Sort
        for (int index = 0; index < arr.length; index++) {
            int smallest = index;
            for (int innerIndex = index + 1; innerIndex < arr.length; innerIndex++) {
                if (arr[smallest] > arr[innerIndex]) {
                    smallest = innerIndex;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[index];
            arr[index] = temp;
        }
        printArray(arr);
    }

    public static void printArray(int arr[]) {
        for (int index = 0; index < arr.length; index++) {
            System.out.println("Your sorted array is : " + arr[index]);
        }

    }
}
