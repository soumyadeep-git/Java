//this program will convert decimal number into binary

import java.util.Scanner;
public class Covert_DecimalToBinary{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    {
        int number;
        int index = 0;
        int array[] = new int[100];
        System.out.println("Enter a binary number ");
        number = input.nextInt();
        while(number > 0)
        {
            array[index] = number%2;
            index++;
            number = number/2;
        }
        System.out.print("Binary number is:- ");
        for(int array_elements = index-1; array_elements > 0; array_elements--)
        {
            System.out.print(array[array_elements]);
        }
    }
}
}