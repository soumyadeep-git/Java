// This will multiply two binary numbers

import java.util.Scanner;
public class Multiply_Two_Binary{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two binary numbers");
        String num1 = input.next();     
        String num2 = input.next();
        /*This will actually take the val   ue 
        from user and store it as string datatype*/
        int binary1 = Integer.parseInt(num1,2);
        int binary2 = Integer.parseInt(num2,2);
        int result = binary1 * binary2;
        System.out.println("The result is " +Integer.toBinaryString(result));
    }
}
        
    

