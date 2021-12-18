
//This program stores the string in an array
import java.util.Scanner;

public class CharacterIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String word = input.nextLine();
        char arr[] = new char[word.length()];
        for (int counter = 0; counter < word.length(); counter++) {
            arr[counter] = word.charAt(counter);
        }
        for (char ch : arr) {
            System.out.println("Your string is :" + ch);
        }
    }
}
