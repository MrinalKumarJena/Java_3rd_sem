//Create a sub-package named shapesunder a package org. Create some classes in the package representing some common geometric shapes like Square, Triangle, Circle and so on. The classes should contain the area( ) and perimeter( ) methods in them. Compile the package. Use this package to find area and perimeter of different shapes as chosen by the user.
package org.shapesunder;

public class Square{
double dim1;
 double dim2;
    public Square(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    void area() {
        System.out.println("Area of Square: " + dim1 * dim2);
    }
    void perimeter()
    {
    	System.out.println("Area of Square: " + 2*(dim1 + dim2));
    }
}
