
//Given a string as input. Delete the characters at odd indices of the string.
import java.util.Scanner;

public class DeletingOddIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = input.nextLine();
        char arr[] = new char[str.length()];
        int index =0;

        for (index; index < str.length(); index++) {
            arr[index] = str.charAt(index);
        }
        for (char ch : arr) {
            System.out.println(ch);
        }
    }
}
