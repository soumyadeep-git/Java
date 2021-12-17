import java.util.Scanner;
public class SquareOfAnumber{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your desired number");
        int number = s.nextInt();
        System.out.println("The square of the number is " +(number*number));
    }
}