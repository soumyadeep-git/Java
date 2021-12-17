package userInput;
// import java.util.Scanner;

// public class start {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println("Enter the divident");
//         int divident = input.nextInt();
//         System.out.println("Enter the divisor");
//         int divisor = input.nextInt();
//         int result = divident / divisor;

//         System.out.println("The result is" + (result));
//     }

// }
import java.util.Scanner;

public class start {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int day = input.nextInt();
        switch (day) {
            case 1:
                System.out.println("I am on leave");
                break;
            case 2:
                System.out.println("I am in office");
                break;
            case 3:
                System.out.println("I am on leave");
                break;
            case 4:
                System.out.println("I am on leave");
                break;
            default:
                System.out.println("Invalid people");

        }

    }
}