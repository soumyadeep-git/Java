
public class Patterns {
    public static void main(String[] args) {
        for (int start = 1; start <= 5; start++) {
            for (int end = 1; end < start; end++) {
                System.out.print("  ");
            }
            for (int end = 1; start <= 5 - start + 1; start++) {

                System.err.print("* ");
            }
            System.out.println();
        }
    }
}
