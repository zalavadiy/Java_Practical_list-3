// Krisha Zalavadiya
// 220130318058
/*Create a main class called “ShapeTester” that does the following:
  Creates one Rectangle object and one Circle object using the constructors provided. 
  Uses the getArea() and getPerimeter() methods to print out the area and perimeter of each shape. */
class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }
}

// class Circle {
//     private double radius;
//     private final double PI = 3.14159;

//     public Circle(double radius) {
//         this.radius = radius;
//     }

//     public double getArea() {
//         return PI * radius * radius;
//     }

//     public double getPerimeter() {
//         return 2 * PI * radius;
//     }
// }
public class ShapeTester_21 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        Circle circle = new Circle(3.5);

        System.out.println("Rectangle:");
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        System.out.println("\nCircle:");
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
    }
}
