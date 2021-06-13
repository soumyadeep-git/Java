/*Write a program to enter the values of two variables 'a' and 'b' 
from keyboard and then check if both the conditions 'a < 50' and 'a < b' are true.*/
import java.util.Scanner;
public class EqualOrNot{
    public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the value of a" +"\nEnter the value of b");
    int a = s.nextInt();
    int b = s.nextInt();
    if((a < 50) &&(a < b)){
        System.out.println("Yes the conditions are true");}
        else{
            System.out.println("FALSE");}
        }
    }