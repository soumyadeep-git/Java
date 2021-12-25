//Bubble Sort => This follows the idea when the heaviest bubble gets pushed to the top 
//and then the other

public class BubbleSort {
    public static void printArray(int arr[]) {
        for (int index = 0; index < arr.length; index++) {
            System.out.print(arr[index] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 55, 22, 3, 1 };
        // Bubble sort
        for (int index = 0; index < arr.length - 1; index++) {
            for (int subIndex = 0; subIndex < arr.length - index - 1; subIndex++) {
                if (arr[subIndex] > arr[subIndex + 1]) {
                    // Swap
                    int temp = arr[subIndex];
                    arr[subIndex] = arr[subIndex + 1];
                    arr[subIndex + 1] = temp;
                }
            }

        }
        printArray(arr);
    }
}
