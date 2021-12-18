
import java.util.Scanner;

public class InputManager {
    static int[] getNumbers() {
        int inputs[];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = input.nextInt();
        inputs = new int[size];
        int counter = 0;
        while (counter < size) {
            System.out.println("Enter the numbers");
            int number = input.nextInt();
            inputs[counter] = number;
            counter++;
        }
        input.close();
        return inputs;
    }
}
