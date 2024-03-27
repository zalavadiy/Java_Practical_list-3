// Krisha Zalavadiya
// 220130318058
/*Create two classes called “Rectangle” and “Circle” that implement the Shape interface. 
The Rectangles class should have the following properties and methods: 
  A private double called “length” 
  A private double called “width” 
  A constructor that takes in a length and width and sets the corresponding fields. 
  Implementation for the getArea() and getPerimeter() methods using the formula :  
area = length * width and  
perimeter = 2 * (length + width)  */
interface Shape{
    double getArea();
    double getPerimeter();
}
class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        System.out.println("Length is :: " + length + " Width is :: " + width);

    }

    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }
}
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        System.out.println("Readius is :: " + radius);

    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }
}
public class P19{
    public static void main(String[] args) {
        Circle c1 = new Circle(2);
        System.out.println("Area of circle :: " + c1.getArea());
        System.out.println("Perimeter of circle :: " + c1.getPerimeter());
        
        Rectangle r1 = new Rectangle(4,5);        
        System.out.println("Area of rectangle :: " + r1.getArea());
        System.out.println("Perimeter of rectangle :: " + r1.getPerimeter());
    }
}
