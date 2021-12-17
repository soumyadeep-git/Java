//this program will cehck whether the given input is between 0 and 1
import java.util.Scanner;
public class Practice{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        double num = input.nextDouble();
        if(num>0 && num<1)
        System.out.println("the number is between 0 and 1");
        else
        System.out.println("the number is not between 0 and 1");
    }
}