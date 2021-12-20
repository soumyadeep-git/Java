import java.util.Arrays;

//Anagram is terminologu used when two strings have same characters occuring 
//in the same exact frequency

public class Anagram1_a {
    public static void main(String[] args) {
        String firstWord = "Silent";
        String secondWord = "Silent";
        char arr1[] = firstWord.toCharArray(); // puts firstword to the array
        char arr2[] = secondWord.toCharArray(); // puts second to the array
        Arrays.sort(arr1); // will sort the array
        Arrays.sort(arr2);

        Boolean result = Arrays.equals(arr1, arr2);
        if (result == true) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not an anagram");
        }
    }
}
