// Krisha Zalavadiya
// 220130318058
/*Create an abstract class called “Shape” with the following properties: 
A protected integer called “numberOfsides”
An abstract method called “calculateArea()” that 
returns a double  */
abstract class Shape2 {
    protected int numberOfSides;

    public Shape2(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public abstract double calculateArea();
}

class Circle2 extends Shape2 {
    private double radius;

    public Circle2(double radius) {
        super(0); // Circles have zero sides
        this.radius = radius;
    }

        public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle2 extends Shape2 {
    private double width;
    private double height;

    public Rectangle2(double width, double height) {
        super(4); // Rectangles have 4 sides
        this.width = width;
        this.height = height;
    }

       public double calculateArea() {
        return width * height;
    }
}

class Triangle2 extends Shape2 {
    private double base;
    private double height;

    public Triangle2(double base, double height) {
        super(3); // Triangles have 3 sides
        this.base = base;
        this.height = height;
    }

        public double calculateArea() {
        return (base * height) / 2;
    }
}

// Main class for testing
public class P14 {
    public static void main(String[] args) {
        Circle2 circle = new Circle2(5.0);
        Rectangle2 rectangle = new Rectangle2(4.0, 6.0);
        Triangle2 triangle = new Triangle2(3.0, 4.0);

        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        System.out.println("Area of Triangle: " + triangle.calculateArea());
    }
}
