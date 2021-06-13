import java.util.Scanner;
    public class Multiplication{
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number for which you want to create the multiplication table");
        int number = input.nextInt();
        for(int i = 0;i < 10;i++){
            System.out.println(number+" x " +i+" = "+number*(i));
        }
    }
}
       
       
  