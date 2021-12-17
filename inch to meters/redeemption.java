//will take a value in inch and convert into meters
import java.util.Scanner;
public class redeemption{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the measurement you want to convert");
        double inches = input.nextDouble();
        double meters = inches * 0.0254;
        System.out.println(inches +" inch in meters is "+meters);
    }
}