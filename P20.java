// Krisha Zalavadiya
// 220130318058
/*The Circle class should have the following properties and methods: 
  A private double called “radius”. 
  A constructor that takes in a radius and sets the corresponding field. 
  Implementation for the getArea() and getPerimeter() methods using the formulas: 
 area = pi * (radius)2 and perimeter = 2 * pi * radius, 
 where pi is the mathematical constant for pi (3.14149....) */
 interface Shape{
    double getArea();
    double getPerimeter();
}
class circle implements Shape {
    private double radius;
    private final double pi = Math.PI;

    public circle(double radius) {
        this.radius = radius;
        System.out.println("Readius is :: " + radius);

    }

    public double getArea() {
        return pi * Math.pow(radius, 2);
    }
    
    public double getPerimeter() {
        return 2 * pi * radius;
    }
}
public class P20{
    public static void main(String[] args) {
        circle c1 = new circle(2);
        System.out.println("Perimeter of circle " + c1.getPerimeter());
        System.out.println("Perimeter of circle " + c1.getArea());
    }
}