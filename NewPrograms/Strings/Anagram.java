//This program will check whether two strings have same characters and if yes,
// then what is the frequency 

public class Anagram {
    public static void main(String[] args) {
        String first = "Soumyadeep";
        String second = "Soumydeep";
        // char arr1[] = new char[first.length()];
        // char arr2[] = new char[second.length()];
        // for (int index = 0; index < first.length(); index++) {
        // arr1[index] = first.charAt(index);
        // }
        // for (char putting1 : arr1) {
        // System.out.println("Your second string : " + putting);
        // }
        // System.out.println();
        // for (int index = 0; index < second.length(); index++) {
        // arr2[index] = second.charAt(index);
        // }
        // for (char putting2 : arr2) {
        // System.out.println("Your second string : " + putting);
        // }
        // if()
        boolean anagram = false;
        for (int indexFirst = 0; indexFirst < first.length(); indexFirst++) {
            char check = first.charAt(indexFirst);
            for (int indexSecond = 0; indexSecond < second.length(); indexSecond++) {
                if (second.charAt(indexSecond) == check) {
                    anagram = true;
                    break;
                }
            }
            if (!anagram) {
                break;
            }
        }
        if (anagram) {
            System.out.println("Anagram");
        }

        else {
            System.out.println("Not an anagram");
        }
    }
}
