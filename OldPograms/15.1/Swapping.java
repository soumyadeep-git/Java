//Swapping two variables with using a third varia
public class Swapping{
    public static void main(String[] args){
      int a,b,temp;
      a = 12; b = 34;
      System.out.println("Before swapping a = "+a+" and b = "+b);
      temp = a;
      a = b;
      b = temp;
      System.out.println("After swapping a = "+a+" and b = "+b);
    }
}