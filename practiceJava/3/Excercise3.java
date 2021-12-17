import java.util.Scanner;

import javax.print.event.PrintEvent;

import java.util.Scanner;

public class Excercise3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a number");
        int number = in.nextInt();
        for (int count = 0; count < 12; count++) {
            System.out.println(number + "X" + (count + 1) + "=" + (number * (count + 1)));
        }
    }

}
