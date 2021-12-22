import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number ");
        int num = input.nextInt();
        for (int i = 1; i <= 12; i++) {
            System.out.println(num + "*" + i + "=" + (i * num));
        }
    }
}
