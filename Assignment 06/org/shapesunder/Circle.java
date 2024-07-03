//Create a sub-package named shapesunder a package org. Create some classes in the package representing some common geometric shapes like Square, Triangle, Circle and so on. The classes should contain the area( ) and perimeter( ) methods in them. Compile the package. Use this package to find area and perimeter of different shapes as chosen by the user.
package org.shapesunder;
public class Circle{
double dim1;
    public Circle(double dim1) {
        this.dim1 = dim1;
    }

    void area() {
        System.out.println("Area of Circle: " +(3.14 * dim1 * dim1));
    }
    void perimeter()
    {
    	System.out.println("Area of Circle: " + (2 * 3.14 * dim1));
    }
}