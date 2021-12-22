//Given a list of names, display the longest name.

import java.util.Scanner;

public class LongestElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String names = "";
        String result = "";
        int maxSize = 0;
        System.out.println("Enter the size : ");
        int size = input.nextInt();
        System.out.println("Enter the names : ");
        for (int index = 0; index <= size; index++) {
            names = input.nextLine();
            if (maxSize < names.length()) {
                maxSize = names.length();
                result = names;
            }

        }
        System.out.println("The longest name is : " + result);
    }
}
