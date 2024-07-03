//Update the Q2 with default and parameterised constructor. Make changes as necessary. Test the functionalities of above methods in the driver class.
import java.util.*;
class Point2D{
	double x, y;
	
	Point2D (double a,double b){
		x=a;
		y=b;
	}
	
	void display(){
		System.out.println("The co-ordinates are :("+x+","+y+")");
	}
}
class Point3D extends Point2D{
	double z;
    Point3D (double a, double b, double c){
        super(a,b);
	    z=c;
	}
	void show(){
		System.out.println("The 3D Co-ordinates are ("+x+","+y+","+z+")");
	}
}
class Asgmt5_3{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the 2D Co-ordinates:");
		double p=sc.nextDouble();
		double q=sc.nextDouble();
		
		Point2D obj1 = new Point2D(p,q);
		System.out.println("Enter the 3D co-ordinates:");
		double t=sc.nextDouble();
		double s=sc.nextDouble();
		double r=sc.nextDouble();
		Point3D obj2= new Point3D(t,s,r);
		obj1.display();
		obj2.show();
	}
}