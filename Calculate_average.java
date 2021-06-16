import java.util.Scanner;
public class Calculate_average{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int limit; 
        float marks;
        int count = 0;
        float sum = 0;
        float average;
        System.out.println("Enter number of exams");
        limit = input.nextInt();
        while(count < limit){
            System.out.println("Enter marks of "+(count+1)+" subject");
            marks = input.nextInt();
            sum = sum + marks;
            count++;
        }
        average = sum / limit;
        System.out.println(average);
    }
    
}