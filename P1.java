// Krisha Zalavadiya
// 220130318058
// Write a Java Program to explain super keyword
import java.util.Scanner;;
class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    void status() {
        System.out.println(name + " is clever student.");
    }
}

class clever extends Student {
    String roll_no;

    clever(String name, String roll_no) {
        super(name);
        this.roll_no = roll_no;
    }

    void display() {
        System.out.println("Name is :: " + name + ".");
        System.out.println("Enrollment number is :: " + roll_no + ".");
        super.status(); // Call to superclass method
    }
}

public class P1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name :: ");
        String name = scanner.nextLine();
        System.out.print("Enter the enrollment number :: ");
        String roll_no = scanner.nextLine();
        scanner.close();
        clever s1 = new clever(name, roll_no);
        s1.display();
    }
}