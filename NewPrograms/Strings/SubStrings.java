
//To trim a substring from the original string
//Here we use a method => string.substring((lowerIndex), (upperIndex))

import java.util.Scanner;

public class SubStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string you want to enter");
        String sentence = input.nextLine();
        System.out.println("Enter the Lower limit  you want to trim : ");
        int lowerLimit = input.nextInt();
        System.out.println("Enter the Upperr limit  you want to trim : ");
        int upperLimit = input.nextInt();
        System.out.println("Your trimmed substring is : " + sentence.substring((lowerLimit), (upperLimit)));
    }
}
