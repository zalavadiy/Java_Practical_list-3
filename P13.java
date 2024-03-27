// Krisha Zalavadiya
// 220130318058
/*Create a test program that creates instances of Circle, Rectangle, and Triangle, and calls their repective getinfo() methods and area/perimeter calculation method */
abstract class Shape {
    public abstract void getInfo();
    public abstract double getArea();
}
  
class Circle extends Shape {
    private double radius;
  
    public Circle(double radius) {
      this.radius = radius;
    }
  
    public void getInfo() {
      System.out.println("This is a circle with radius " + radius);
    }
  
    public double getArea() {
      return Math.PI * radius * radius;
    }
}
  
class Rectangle extends Shape {
    private double length;
    private double width;
  
    public Rectangle(double length, double width) {
      this.length = length;
      this.width =width;
    }
  
    public void getInfo() {
      System.out.println("This is a rectangle with length " + length + " and width " + width);
    }
  
    public double getArea() {
      return length * width;
    }
}
  
class Triangle extends Shape {
    private double a;
    private double b;
    private double c;
  
    public Triangle(double a, double b, double c) {
      this.a = a;
      this.b = b;
      this.c = c;
    }
  
    public void getInfo() {
      System.out.println("This is a triangle with sides of length " + a + ", " + b + ", and " + c);
    }
  
    public double getArea() {
      double s = (a + b + c) / 2;
      return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
public class P13 {
    public static void main(String[] args) {
      Circle circle = new Circle(5);
      Rectangle rectangle = new Rectangle(10, 12);
      Triangle triangle = new Triangle(7, 8, 6);
  
      circle.getInfo();
      System.out.println("Area: " + circle.getArea());
  
      rectangle.getInfo();
      System.out.println("Area: " + rectangle.getArea());
  
      triangle.getInfo();
      System.out.println("Area: " + triangle.getArea());
    }
}