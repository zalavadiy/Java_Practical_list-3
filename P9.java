// Krisha Zalavadiya
// 220130318058
// Create a Java program that models a hierarchy of shapes. The hierarchy should include a Shape class as the base class, with subclasses Circle, Rectangle, and Triangle
import java.util.*;
abstract class Shape {
    abstract double area();
    abstract double perimeter();
}

class Circle extends Shape {
    private double radius;

    public Circle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        this.radius = scanner.nextDouble();
        scanner.close();
    }

    double area() {
        return Math.PI * radius * radius;
    }

    double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        this.length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        this.width = scanner.nextDouble();
        scanner.close();
    }

    double area() {
        return length * width;
    }

    double perimeter() {
        return 2 * (length + width);
    }
}

class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of side 1 of the triangle: ");
        this.side1 = scanner.nextDouble();
        System.out.print("Enter the length of side 2 of the triangle: ");
        this.side2 = scanner.nextDouble();
        System.out.print("Enter the length of side 3 of the triangle: ");
        this.side3 = scanner.nextDouble();
        scanner.close();
    }

    double area() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    double perimeter() {
        return side1 + side2 + side3;
    }
}

public class P9 {
    public static void main(String[] args) {

        Shape circle = new Circle();
        System.out.println("Circle Area: " + circle.area());
        System.out.println("Circle Perimeter: " + circle.perimeter());

        Shape rectangle = new Rectangle();
        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Rectangle Perimeter: " + rectangle.perimeter());

        Shape triangle = new Triangle();
        System.out.println("Triangle Area: " + triangle.area());
        System.out.println("Triangle Perimeter: " + triangle.perimeter());

    }
}