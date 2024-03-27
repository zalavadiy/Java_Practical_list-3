// Krisha Zalavadiya
// 220130318058
// Write a java program to demonstrate multiple inheritance using interface 
interface A {
    default void displayA() {
        int a=15, b = 15;
        System.out.println("Sum of " + a + " and " + b + " :: "+(a + b));
    }
}

interface B {
    default void displayB() {
        int a = 100, b = 90;
        System.out.println("difference between " + a + " and " + b + " :: " + (a - b));
    }
}

interface C extends A, B {
    default void displayC() {
        int a = 3, b = 6;
        System.out.println("Multiplication  of " + a + " and " + b + " :: "+(a * b));
    }
}

class D implements C {
    public void display() {
        int a = 36, b = 6;
        System.out.println("Divition  of " + a + " and " + b + " :: "+(a / b));
    }
}

public class P7 {
    public static void main(String[] args) {
        D d = new D();
        d.displayA();
        d.displayB();
        d.displayC();
        d.display(); 
    }
}
