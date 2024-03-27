// Krisha Zalavadiya
// 220130318058
// Create a class to find out whether the given year is leaping year or not. (Use inheritance for this program) 
import java.util.Scanner;;
class Year {
    int year;

    Year(int year) {
        this.year = year;
    }

    boolean leapyear() {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}

// Subclass
class Checkyear extends Year {
    Checkyear(int year) {
        super(year);
    }

    void check() {
        if (leapyear()) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}

public class P2 {
    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year to check year is leap year or not :: ");
        year = scanner.nextInt();
        scanner.close();
        Checkyear checkyear = new Checkyear (year);
        checkyear.check();
    }
}