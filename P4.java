// Krisha Zalavadiya
// 220130318058
// Write a program of method overriding
import java.util.*;

class number {
    int num1, num2;
    public void overriding(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
}

class add extends number {
    int num1, num2,sum;
    public void overriding(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        sum = num1 + num2;
        System.out.println("Sum is two numbers ::" + sum);
    }
}

class diff extends number {
    int num1, num2,sub;
    public void overriding(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        sub = num1 - num2;
        System.out.println("Subtrection is two numbers ::" + sub);
    }
}

public class P4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number :: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number :: ");
        int num2 = scanner.nextInt();
        scanner.close();
        number Sum = new add();
        number Sub = new diff();
        Sum.overriding(num1, num2);
        Sub.overriding(num1, num2);
    }
}