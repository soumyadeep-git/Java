//Write a Java program that accepts four integer from the user and prints equal if all four are equal, and not equal otherwise. 
import java.util.Scanner;
public class Practice{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter any four integers: ");
    int num1 = input.nextInt();
    int num2 = input.nextInt();
    int num3 = input.nextInt();
    int num4 = input.nextInt(); 
    if(num1==num2 && num2==num3 && num3==num4){
        System.out.println("the numbers are equal");
    }
    else{
        System.out.println("the numbers are not equal");
    }
}}
      