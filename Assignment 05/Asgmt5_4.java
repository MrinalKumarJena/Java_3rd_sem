/*Create a derived class Circle inherited from the class Point2D (created in Q2) with the data member radius and method area() that returns the area of circle. Create a subclass called Cylinder which is derived from the superclass Circle having data member height and volume() that computes the volume of cylinder. Use constructor to initialize the instance variables. Test the methods of Circle and Cylinder classes by creating objects in the main method of another class.*/
import java.util.*;

class Point2D {
    double x, y;

    Point2D(double a, double b) {
        x = a;
        y = b;
    }

    Point2D() {
        x = 0;
        y = 0;
    }

    void display() {
        System.out.println("The coordinate is (" + x + " , " + y + ")");
    }
}

class Circle extends Point2D {
    double radius;

    Circle(double a, double b, double r) {
        super(a, b);
        radius = r;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

class Cylinder extends Circle {
    double height;

    Cylinder(double a, double b, double r, double h) {
        super(a, b, r);
        height = h;
    }

    double volume() {
        return area() * height;
    }
}

class TestClasses {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the coordinates for the center of the circle:");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        System.out.println("Enter the radius of the circle:");
        double radius = sc.nextDouble();

        Circle circle = new Circle(x, y, radius);

        System.out.println("Enter the height of the cylinder:");
        double height = sc.nextDouble();

        Cylinder cylinder = new Cylinder(x, y, radius, height);

        circle.display();
        System.out.println("Area of the Circle: " + circle.area());

        System.out.println();

        cylinder.display();
        System.out.println("Area of the Circle (base of Cylinder): " + cylinder.area());
        System.out.println("Volume of the Cylinder: " + cylinder.volume());
    }
}