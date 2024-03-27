// Krisha Zalavadiya
// 220130318058
/*Each subclass should have its own specific attributes and methods. For example: 
-> Circle should have a radius attribute and a method to calculate its area. 
-> Rectangle should have attributes for its width and height, and methods to calculate its area and perimeter. 
-> Triangle should have attributes for its base and height, and methods to calculate its area and perimeter */
import java.util.*;
abstract class Shape {
    abstract double area();
    abstract double perimeter();
}

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
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

    Rectangle(double width, double height) {
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

    Triangle(double base, double height) {
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

public class P10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius, height, width, base;
        
        System.out.print("Enter the radius of the given circle :: ");
        radius = scanner.nextDouble();
        System.out.print("Enter the height :: ");
        height = scanner.nextDouble();
        System.out.print("Enter the width :: ");
        width = scanner.nextDouble();
        System.out.print("Enter the base :: ");
        base = scanner.nextDouble();

        Circle circle = new Circle(radius);
        System.out.println("Circle Area :: " + circle.area());
        System.out.println("Circle Perimeter :: " + circle.perimeter());

        Rectangle rectangle = new Rectangle(height, width);
        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Rectangle Perimeter: " + rectangle.perimeter());

        Triangle triangle = new Triangle(height, base);
        System.out.println("Triangle Area: " + triangle.area());
        System.out.println("Triangle Perimeter: " + triangle.perimeter());
        
        scanner.close();
    }
}
