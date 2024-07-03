//Define a class ‘Box’ that uses a parameterized constructor to initialize the dimensions of a box. The dimensions of the Box are width, height, depth. The class should have a method that can return the volume of the box. Create an object of the Box class and test the functionalities
import java.util.*;
class Box{
	double length,width,depth;
    Box(double x,double y,double z){
    	length=x;
    	width=y;
    	depth=z;
    }
    double volume(){
  	return length*width*depth;
  	}
}
class Asgmt4_1{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the length of the box:");
		double l=sc.nextDouble();
		System.out.print("Enter the width of the box:");
		double w=sc.nextDouble();
		System.out.print("Enter the depth of the box:");
		double d=sc.nextDouble();
		Box b=new Box(l,w,d);
		double v=b.volume();
		System.out.println("The volume of the box is:"+v);
	}
}