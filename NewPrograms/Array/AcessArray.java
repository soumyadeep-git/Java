import java.util.Scanner;

public class AcessArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students : ");
        int numOfStudents = input.nextInt();

        int marks[] = new int[numOfStudents];
        System.out.print("Enter the marks of the students: ");
        marks = input.nextInt();
        for (int putter = 0; putter < numOfStudents; putter++) {
            marks[putter] = input.nextInt();

        }
        int average = marks / numOfStudents;
        System.out.println(average);

    }
}
