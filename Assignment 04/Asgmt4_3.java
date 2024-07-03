//Design a class ‘Point’ with data members as xCo and yCo. The class should have a parameterized constructor to initialize its data members. Define a method distanceBetPoints() which returns the distance between two points.
import java.util.*;
class Point{
	int x,y;	
	Point(int xCo, int yCo){
		x=xCo;
		y=yCo;
	}
	Point distanceBetPoints(Point a, Point b){
		Point q = new Point(0,0);
		q.x = (a.x-b.x);
		q.y = (a.y-b.y);
		return q;
	}
	void display(){
		double result= Math.pow(x,2) + Math.pow(y,2);
		double distance = Math.sqrt(result);
		System.out.println("Distance between the points: "+distance);
	}
}
class Asgmt4_3{
	public static void main(String args[]){
		int p,q,r,s;
	    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the x and y coordinate of the first point: ");
        p = sc.nextInt();
        q = sc.nextInt();
        Point a = new Point(p, q);
        System.out.print("Enter the x and y coordinate of the second point: ");
        r = sc.nextInt();
        s = sc.nextInt();
		Point b = new Point(r,s);
		Point c = new Point(0,0);
	    c = c.distanceBetPoints(a,b);
		c.display();
	}
}