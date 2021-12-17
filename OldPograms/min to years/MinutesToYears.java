// this will change minutes into years
import java.util.Scanner;
public class MinutesToYears{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the no. of minutes you want to convert in years");
        long minutes = input.nextLong();
        long years = minutes*24*365;
        System.out.println(minutes+" in years will be "+years);
    }
}
        
      
        