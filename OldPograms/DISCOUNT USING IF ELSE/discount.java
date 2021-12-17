//discount only if the items costs more than $1000 
//suppose one unit costs $100
import java.util.Scanner;
public class discount{
public static void main(String[]args){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter quantity");
    int quantity = s.nextInt();
    if((quantity)>1000){
        System.out.println("Congratulations you get a discount of 10%"+ "and your total cost is " + ((quantity)-(quantity*0.1)));
    }
    else{
        System.out.println("Sorry!!! no discount");
    }}}