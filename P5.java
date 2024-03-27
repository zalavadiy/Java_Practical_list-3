// Krisha Zalavadiya
// 220130318058
// Write a Java program to demonstrate multilevel Inheritance
import java.util.*;
class number1 {
    int a;
    void get_data(int a) {
        this.a = a;
    }
}
class number2 extends number1{
    int b;
    void get(int b){
        this.b = b;
    }
}
class sum extends number2{
    void show(){
        int sum = a+b;
        System.out.println("Sum is two numbers :: " + sum);
    }
}
public class P5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b;
        System.out.print("Enter the first  number ::");
        a = scanner.nextInt();
        System.out.print("Enter the second  number ::");
        b = scanner.nextInt();
        scanner.close();
        sum add = new sum();
        add.get_data(a);
        add.get(b);
        add.show();
    }
}