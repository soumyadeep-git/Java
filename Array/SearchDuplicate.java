
// //This program will find any duplicate elements in an array

// //1(way) ==> Brute-force : This will compare 1st element with every element
// and then 2nd with every and so on...
// //This is not a very effective way as it will take up a long time if there a
// large number of elements
// public class SearchDuplicate {
// public static void main(String[] args) {
// int arr[] = { 2, 3, 6, 2 };
// for (int index = 0; index < arr.length; index++) {
// for (int subIndex = 0; subIndex < arr.length; subIndex++) {
// if (arr[index] == arr[subIndex] && (index != subIndex)) {
// System.out.println("The duplicate element is : " + arr[subIndex]);
// }
// }
// }
// }
// }
// 2nd(way) ==> Set Interface : The rule of Set is that it does not contain
// duplicate items, we use that.
import java.util.Set;
import java.util.HashSet;

public class SearchDuplicate {
    public static void main(String[] args) {
        int arr[] = { 3, 6, 2, 4, 2 };
        Set<Integer> set = new HashSet<>();
        for (int findNo : arr) {
            if (set.add(findNo) == false) {
                System.out.println("Duplicate elements are : " + findNo);
            }
        }
    }
}