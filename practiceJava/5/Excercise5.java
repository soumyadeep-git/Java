//addimg all the rray elements
public class Excercise5 {
    public static void main(String[] args) {
        int[] numbers = new int[] { 20, 11, 1 };
        int sum = 0;
        for (int count = 0; count < numbers.length; count++) {
            sum = sum + numbers[count];
        }
        System.out.println(sum);
    }
}
// average of all the array elements

public class Excercise5 {
    public static void main(String[] args) {
        int[] numbers = new int[] { 20, 11, 1 };
        int sum = 0;
        for (int count = 0; count < numbers.length; count++) {
            sum = sum + numbers[count];
        }
        int average = (sum / numbers.length);

        System.out.println(average);
    }
}

public class Exercise5 {

    public static void main(String[] args) {

        int[] numbers = new int[] { 20, 30, 25, 35, -16, 60, -100 };
        // calculate sum of all array elements
        int sum = 0;
        for (int i = 0; i < numbers.length; i++)
            sum = sum + numbers[i];
        // calculate average value
        double average = sum / numbers.length;
        System.out.println("Average value of the array elements is : " + average);
    }
}
