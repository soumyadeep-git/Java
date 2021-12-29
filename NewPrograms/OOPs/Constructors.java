import java.security.Principal;

class Student {
    String name;
    int grade;

    public void printInfo() {
        System.out.println("The name of the student is : " + this.name);
        System.out.println("The grade of the student is : " + this.grade);
    }

    // 1st type => Non-paramaterized contructor(will return nothing)
    Student() {
        System.out.println("Constructor loaded ");
    }

    // 2nd Type => Paramerterized constructors
    // Here we initialize a constructor with parameters

    Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    // 3rd Type => Copy constructors
    // Objects of one constructor can be copied to another constructor

    Student(Student second) {
        this.name = second.name;
        this.grade = second.grade;
    }

    Student() {

    }
}

public class Constructors {
    public static void main(String[] args) {
        Student first = new Student();
        first.name = "Abhay";
        first.grade = 12;
        first.printInfo();

        Student second = new Student(first);
        second.printInfo();
    }
}

// NOTE : As constructors can create an object, there should be a way to also
// destroy them
// after use but in JAVA we don't have to do that manually
// it get's automatically deleted with the help of garbage collector
// it deletes every object, method, and variables which is not used in the code