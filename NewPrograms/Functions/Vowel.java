// Write a value-returning method, isVowel that returns the value true if a given character 
// is a vowel, and otherwise returns false. 
// In main() method accept a string from user and count number of vowels in that string.

import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter the string");
        String str = input.next();
        for (int index = 0; index < str.length(); index++) {
            if (VowelCheck(str.charAt(index))) {
                count++;
            } else {
                count = 0;
            }

        }
        System.out.println("The number of vowels in you string is : " + count);
    }

    public static boolean VowelCheck(char alphabets) {
        switch (alphabets) {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                return true;
            default:
                return false;
        }
    }
}
