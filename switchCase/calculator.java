
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        int first = input.nextInt();
        System.out.println("Enter the second number");
        int second = input.nextInt();
        System.out.println("Enter the operator to be used");
        input.nextLine();
        char operator = input.nextLine().charAt(0);
        int result = 0
        System.out.println("Enter the first number");
        int number1=input.nextInt();;

        switch (operator) {
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '/':
                result = first / second;
                break;
            case '*':
                result = first * second;
                break;
            default:
                System.out.println("Invalid ");

        }
        System.out.println(result);
    }
}
