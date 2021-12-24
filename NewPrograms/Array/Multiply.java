//Multiplying Array elements
// Input : arr[ ] = {1, 2, 3, 4}
// Output : 21
// Explanation:
// Sum up an array from index 0 to 1 = 3
// Sum up an array from index 2 to 3 = 7
// Their multiplication is 21.â€‹â€‹

public class Multiply {
    public static void main(String[] args) {
        int arr[] = { 2, 1, 55, 6 };
        int mul = 1;
        for (int index = 0; index < arr.length; index++) {
            mul = mul * arr[index];
        }
        System.out.println(mul);

    }
}
