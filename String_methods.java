import java.util.Scanner;
public class Tolowercase{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();
        System.out.println(str);
        String lower = str.toLowerCase();
        System.out.println(lower);
        int length = str.length();
        System.out.println(length);
    }
}

        
        