import java.util.Scanner;
public class Case{
    public static void main(String[] args){
      Scanner s = new Scanner(System.in);
      System.out.println("Enter any character");
      char a = s.nextChar();
      if(a<=65 && a>90)
      {
          System.out.println("It is a uppercase character");
        }
        else if(a>=97 && a<=192){
              System.out.println("It is a lowercase character");
            }
            else if(a>=48 && a<=57){
                  System.out.println("It is a digit character");}
                  else{
                      System.out.println("It is a special character");}}}