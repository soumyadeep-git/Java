// //In this program we need to find the sum of digits
// //We will only use while loop here because the numbers in the digit is not
// set
// //So we will first divide every digit with % and then sum each of the numbers

// import java.util.Scanner;

// public class SumOfDigits {
// public static void main(String[] args) {
// Scanner input = new Scanner(System.in);
// System.out.print("Enter the digit: ");
// int number = input.nextInt();

// int temp = number;
// int sum = 0;
// while (temp > 0) {
// int lastDigit = temp % 10;
// temp = temp / 10;
// sum = sum + lastDigit;
// }
// System.out.println("The sum of the digits : " + sum);
// }
// }
// Java program to check Armstrong number using for loop
