//Will print first 10 natural numbers in reverse order 

public class reverseOrder {
    public static void main(String[] args) {
        int naturalNum = 10;
        while (naturalNum <= 10 && naturalNum >= 0) {
            System.out.print(naturalNum + " ,");
            naturalNum--;
        }

    }
}
