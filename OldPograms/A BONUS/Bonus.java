//company wioll give 5% bonus if he/she has served more than 5 years
import java.util.Scanner;
public class Bonus{
    public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the no. of years you have worked here");
    int noy = s.nextInt();
    System.out.println("Enter your CTC");
    int ctc = s.nextInt();
    if(noy > 5){
        System.out.println("Congratulations you get a bonus of 5% and your new salary will be"+((ctc)+0.05*ctc));}
        else{
            System.out.println("First work hard");
        }}}