//This will execute first 10 natural even  umbers from 0-10

public class EvenNum {
    public static void main(String[] args) {
        int evenChecker = 0;
        while (evenChecker <= 10 && evenChecker >= 0) {

            if (evenChecker % 2 == 0) { // this will check whether the number is even or odd
                System.out.println(evenChecker);

            }
            evenChecker++; // it incereaments the variables in order to execute the next

        }
    }
}
