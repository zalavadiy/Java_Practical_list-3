// Krisha Zalavadiya
// 220130318058
/*Create an interface called “Shape” that defines the following methods: 
  A method called “getArea()” that returns a double representing the area of the shape 
  A method called “getPerimeter()” that returns a double representing the perimeter of the shape */
interface Shape {
    double getArea();
    double getPerimeter();
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

public class P18 {
    public static void main(String[] args) {
        Circle c1 = new Circle(2);
        System.out.println("Area of circle :: " + c1.getArea());
        System.out.println("Perimeter of circle :: " + c1.getPerimeter());
    }
}
