// Krisha Zalavadiya
// 220130318058
// The Shape class should have a constructor that takes the shape’s color as an argument. Each subclass should call super in its constructor to initialize this field.
import java.util.*;

abstract class Shape {
    private String color;

    Shape(String color) {
        this.color = color;
    }

    abstract double area();
    abstract double perimeter();

    public String getColor() {
        return color;
    }
}

class Circle extends Shape {
    private double radius;

    Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }

    double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    Rectangle(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    double area() {
        return width * height;
    }

    double perimeter() {
        return 2 * (width + height);
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    Triangle(double base, double height, String color) {
        super(color);
        this.base = base;
        this.height = height;
    }

    double area() {
        return 0.5 * base * height;
    }

    double perimeter() {
        return 3 * base;
    }
}

public class P11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius, height, width, base;
        String color;

        System.out.print("Enter the radius of the given circle :: ");
        radius = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter the color :: ");
        color = scanner.nextLine();
        Circle circle = new Circle(radius, color);
        System.out.println("Circle Area: " + circle.area());
        System.out.println("Circle Perimeter: " + circle.perimeter());
        System.out.println("Circle Color: " + circle.getColor());

        System.out.print("Enter the width :: ");
        width = scanner.nextDouble();
        System.out.print("Enter the height :: ");
        height = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter the color :: ");
        color = scanner.nextLine();
        Rectangle rectangle = new Rectangle(width, height, color);
        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Rectangle Perimeter: " + rectangle.perimeter());
        System.out.println("Rectangle Color: " + rectangle.getColor());

        System.out.print("Enter the base :: ");
        base = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter the color :: ");
        color = scanner.nextLine();
        Triangle triangle = new Triangle(base, height, color);
        System.out.println("Triangle Area: " + triangle.area());
        System.out.println("Triangle Perimeter: " + triangle.perimeter());
        System.out.println("Triangle Color: " + triangle.getColor());

        scanner.close();
    }
}
