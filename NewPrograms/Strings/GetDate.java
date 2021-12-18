
//Will give you the current date and time
//1st way => Default
// import java.time.LocalDateTime;

// public class GetDate {
//     public static void main(String[] args) {
//         LocalDateTime current = LocalDateTime.now();
//         System.out.println("The current Date and time is " + current);
//     }
// }

// 2nd way => With pattern
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GetDate {
    public static void main(String[] args) {
        LocalDateTime current = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
        String formatted = current.format(formatter);

        System.out.println("Current Date and Time is: " + formatted);

    }
}
