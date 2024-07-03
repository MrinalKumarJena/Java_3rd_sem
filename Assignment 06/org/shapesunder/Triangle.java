//Create a sub-package named shapesunder a package org. Create some classes in the package representing some common geometric shapes like Square, Triangle, Circle and so on. The classes should contain the area( ) and perimeter( ) methods in them. Compile the package. Use this package to find area and perimeter of different shapes as chosen by the user.
import java.lang.*;
package org.shapesunder;
public class Triangle{
double dim1, dim2, dim3;
    public Triangle(double dim1, double dim2, double dim3) {
        this.dim1 = dim1;
        this.dim2 = dim2;
        this.dim3 = dim3;
    }
    double s = dim1 + dim2 + dim3;
    double m=s/2;
    public double perimeter()
    {
    	System.out.println("Area of Triangle: " +s);
    }
    public void area()
    {
        System.out.println("Area of Triangle: " + (m * Math.sqrt((m-dim1)*(m-dim2)*(m-dim3))));
    }
}