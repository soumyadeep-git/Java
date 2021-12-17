/*Write a Java program to print the sum (addition), multiply, 
  
 subtract, divide and remainder of two numbers*/
 import java.util.Scanner;
 public class Operations{
     public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     System.out.println("Enter two numbers");
     int input1 = input.nextInt();
     int input2 = input.nextInt();
     System.out.println(input1 +" added by "+ input2 +" will be "+(input1+input2));
     System.out.println(input1 +" multipled "+ input2 +" will be "+(input1*input2));
     System.out.println(input1 +" substracted " + input2+ "will be "+(input1-input2));
     System.out.println(input1 +" divided "+ input2+ " will be "+(input1/input2));
     System.out.println(input1 +" mod "+ input2 +" will be "+(input1%input2));
    }
}
     