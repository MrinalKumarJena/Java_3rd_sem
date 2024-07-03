/*Create a class Point2D with the data member x and y coordinate and methods getCoord() that sets the coordinate value and display() to show the coordinates. Create a subclass called Point3D which is derived from the superclass Point2D with data members z coordinate and has methods getInput() to initialize the input and show() method to display the coordinates. Test the methods of both the classes by creating objects in the main method of driver class.*/
import java.util.*;
class Point2D{
	double x, y;
	
	void getCoord(double a,double b){
		x=a;
		y=b;
	}
	
	void display(){
		System.out.println("The co-ordinates are :("+x+","+y+")");
	}
}
class Point3D extends Point2D{
	double z;
    void getinput(double a, double b, double c){
	    x=a;
	    y=b;
	    z=c;
	}
	void show(){
		System.out.println("The 3D Co-ordinates are ("+x+","+y+","+z+")");
	}
}
class Asgmt5_2{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the 2D Co-ordinates:");
		double p=sc.nextDouble();
		double q=sc.nextDouble();
		
		Point2D obj1 = new Point2D();
		obj1.getCoord(p,q);
		System.out.println("Enter the 3D co-ordinates:");
		double t=sc.nextDouble();
		double s=sc.nextDouble();
		double r=sc.nextDouble();
		Point3D obj2= new Point3D();
		obj2.getinput(t,s,r);
		obj1.display();
		obj2.show();
	}
}