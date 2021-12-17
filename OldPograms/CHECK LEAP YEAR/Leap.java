//check whether the given year is leap or not
import java.util.Scanner;
public class Leap{
    public static void main(String[] args){
        int year;
        Scanner s = new Scanner(System.in);
        System.out.print(" Enter any year:");
        year = s.nextInt();
        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
         System.out.println("Specified year is a leap year");
      else
         System.out.println("Specified year is not a leap year");
        }
    }