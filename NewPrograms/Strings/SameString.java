//Checks whether the two input strings are same or not

import java.util.Scanner;

public class SameString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first string");
        String before = input.nextLine();
        System.out.println("Enter second string");
        String after = input.nextLine();
        boolean result = false;
        if (before.equals(after)) { // You should not use == (equality operator) to compare these strings because
                                    // they compare the reference of the string, i.e. whether they are the same
                                    // object or not.

            result = true;
            System.out.println("The strings are equal : " + result);

        }

    }
}
