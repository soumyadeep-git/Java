// import java.util.Scanner;

// public class power {
//     public static void main(String[] args) {

//         Scanner input = new Scanner("System.in")

//         System.out.println("Enter the base");
//         int base= input.nextInt();

//         System.out.println("Enter the power");
//         int power=input.nextInt();

//         for(int flag = 0   )
//     }
// }
import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int base;
        int power;
        int result = 1;

        System.out.print("Enter the base number ");
        base = console.nextInt();

        System.out.print("Enter the power ");
        power = console.nextInt();

        for (int i = 1; i <= power; i++) {
            result *= base;
        }

        System.out.println("Result: " + result);
    }
}