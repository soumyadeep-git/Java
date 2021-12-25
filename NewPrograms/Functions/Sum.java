//Sum with function concept 

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number");
        int num1 = input.nextInt();
        System.out.print("Enter the second number");
        int num2 = input.nextInt();
        int sum = getTotal(num1, num2);
        System.out.println("The total is : " + sum);
    }

    public static int getTotal(int number1, int number2) {
        return number2 + number1;
    }
}