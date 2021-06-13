/* Write a Java program to compare two numbers. 
Input Data:
Input first integer: 25
Input second integer: 39
Expected Output

25 != 39                                                                          
25 < 39                                                                           
25 <= 39*/

import java.util.Scanner;
public class Compare{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        long num1 = input.nextLong();
        System.out.println("Enter second number");
        long num2 = input.nextLong();
        if(num1 != num2){
            System.out.println(num1+" != " +num2);
        }
        if(num1 < num2){
            System.out.println(num1+" < "+num2);
        }
        if(num1 <= num2){
              System.out.println(num1+" <= "+num2);
            }
        }
    }
        