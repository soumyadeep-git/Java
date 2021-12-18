
import java.util.Scanner;

public class uber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number betwee 1-3");
        int num = input.nextInt();
        String rating = null;
        switch (num) {
            case 1:
                rating = "Good";
                break;
            case 2:
                rating = "Average";
                break;
            case 3:
                rating = "Bad";
                break;
        }
        System.out.println(rating);
    }
}
