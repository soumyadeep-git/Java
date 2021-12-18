//This program will find the index of a string

import java.util.Scanner;

public class Simple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String word = input.nextLine();
        System.out.println("Enter the index : ");
        int index = input.nextInt();
        int find = word.charAt(index);
        System.out.println((char) find);

    }
}
