// public class SumOfArray {
//     public static void main(String[] args) {
//         int arr[] = { 12, 23, 45, 33 };
//         int sum = 0;
//         for (int counter = 0; counter < arr.length; counter++) {
//             sum = sum + arr[counter];
//         }
//         System.out.println("the sum of the array is : " + sum);
//     }
// }

public class BasicParts {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 6 };
        int mul = 1;
        for (int counter = 0; counter < arr.length; counter++) {
            mul = mul * arr[counter];
        }
        System.out.println("the result is : " + mul);
    }
}