//Calculate the Perimeter of a rectangle

import java.util.Scanner;
public class Perimeter{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length and breadth");
        double length = input.nextDouble();
        double breadth = input.nextDouble();
        System.out.println("The perimeter is "+(2*(length+breadth)));
    }
}
 