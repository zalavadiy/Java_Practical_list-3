// Krisha Zalavadiya
// 220130318058
/*Create two subclasses of Shape called “Rectangle” and“Triangle” with the following properties and methods: 
Rectangle: 
  A private double called “length” 
  A private double called “width”  
  A constructor that takes in two doubles (length and width) and sets the corresponding fields. 
  An implementation of the calculateArea() method that return length * width. 
Triangle: 
  A private double called “base” 
  A private double called “height” 
  A constructor that takes in two doubles (base and height) and sets the corresponding fields. An implementation of the calculateArea() method that returns (base * height)/2. 
Create a main class called “ShapeTester” with the following properties and methods: 
  A static method called “printShapeArea” that takes in a Shape object and prints out the area of the shape. 
  In the main method, create one Rectangle and one Triangle object, pass them into the printShapeArea method, and observe the output.  */
abstract class Shape {
    public abstract double calculateArea();
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

        public double calculateArea() {
        return length * width;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    
    public double calculateArea() {
        return (base * height) / 2;
    }
}

public class  P15{
    public static void printShapeArea(Shape shape) {
        System.out.println("Area of the shape: " + shape.calculateArea());
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        Triangle triangle = new Triangle(3.0, 4.0);

        printShapeArea(rectangle);
        printShapeArea(triangle);
    }
}
