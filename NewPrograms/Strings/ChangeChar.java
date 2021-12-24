
//We use the concept of Stringbuilder here
//Changing the character of a string at a particular index
import java.util.Scanner;

public class ChangeChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string");
        // String str = input.next();
        StringBuilder store = new StringBuilder(input.next());
        // System.out.println(str.charAt(2)); // printing the value at 2 index
        System.out.println("Enter the character you want to replace");
        char set = input.next().charAt(0);
        System.out.println("Enter the index you want to replace");
        int index = input.nextInt();
        store.setCharAt(index, set);
        System.out.println("New String : " + store);
    }
}
