
// public class naturalSum {
//     public static void main(String[] args) {
//         int sum = 0;
//         for (int counter = 0; counter < 100; counter++) {
//             sum = sum + counter;
//             System.out.println(sum);
//         }
//     }
// }
public class naturalSum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
    }
}