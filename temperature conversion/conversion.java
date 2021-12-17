import java.util.Scanner;
class conversion{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a degree in farenheit:");
        double farenheit = input.nextDouble();
        double celcius = (( 5 *(farenheit - 32.0)) / 9.0);
        System.out.println(farenheit+" in ferenheit degree is equal to " +celcius+ " in celcius degress");
    }}
    