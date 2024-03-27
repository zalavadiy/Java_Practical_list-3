// Krisha Zalavadiya
// 220130318058
/*The Shape class should also have a method public String getinfo() that returns a string containing the shape’s color. Each subclass should override the getinfo() method to include its own specific attributes in the returned string. */
class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getInfo() {
        return "Color: " + color;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public String getInfo() {
        return super.getInfo() + ", Radius: " + radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public String getInfo() {
        return super.getInfo() + ", Width: " + width + ", Height: " + height;
    }
}

public class P12 {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5.0);
        Rectangle rectangle = new Rectangle("Blue", 3.0, 4.0);

        System.out.println(circle.getInfo());
        System.out.println(rectangle.getInfo());
    }
}
