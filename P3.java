// Krisha Zalavadiya
// 220130318058
// Write a program of interface implementation.
import java.util.Scanner;
interface Shape {
    double area();
    double perimeter();
}

class Circle implements Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }
}

public class P3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle :: ");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println("Area of the circle :: " + circle.area());
        System.out.println("Perimeter of the circle :: " + circle.perimeter());

        System.out.print("Enter the length of the rectangle :: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle :: ");
        double width = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(length, width);
        System.out.println("Area of the rectangle :: " + rectangle.area());
        System.out.println("Perimeter of the rectangle :: " + rectangle.perimeter());
        scanner.close();
    }
}