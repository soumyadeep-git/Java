//Here we use a string method to convert the string to upper or lower case
//we use string.toUpperCase() and vice versa   

import java.util.Scanner;

public class Uppercase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string you want to enter");
        String sentence = input.nextLine();
        System.out.println("Your converted string in uppercase is : " + sentence.toUpperCase());

    }
}
