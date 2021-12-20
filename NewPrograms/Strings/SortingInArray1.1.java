
import java.util.Scanner;

public class FrequencyOfString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first string : ");
        String first = input.nextLine();
        char freq[] = new char[first.length()];
        char sword = 's';
        for (int index = 0; index < first.length(); index++) {
            freq[index] = first.charAt(index);
            if (first.charAt(index) == sword) {
                System.err.println("err");
            }

        }
        for (char ch : freq) {
            System.out.println(ch);
            if (ch == sword) {
                System.err.println("err");
            }
        }

        // System.out.println("Enter second string : ");
        // String second = input.nextLine();

    }
}
