
//Will check whether the last two letters of input arrays are same or not

import java.util.Scanner;

public class CompareEnds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first string");
        String before = input.nextLine();
        // System.out.println("Enter second string");
        // String after = input.nextLine();
        char beforeArray[] = new char[before.length()];
        int string1 = 0;
        for (string1 = 0; string1 < before.length(); string1++) {
            beforeArray[string1] = before.charAt(string1);

        }
        for (char ch : beforeArray) {
            System.out.println("The elements in your array at index" + string1 + " is : " + ch);
        }
        // for (int string1 = 0; string1 < before.length(); string1++) {
        // System.out.println(beforeArray[string1]); // printing th elements
        // }

    }
}
