/*Define an interface Calculator which has the basic methods add(), sub( ), mul() and div(). Define a concrete class named as DemoCalculator that implements the interface. Define the driver class, which create object reference of the interface Calculator and perform all basic operation of the calculator.*/
import java.util.*;

interface Calculator{
	double add(double a,double b);
	double sub(double a,double b);
	double mul(double a,double b);
	double div(double a,double b);
}
class DemoCalculator implements Calculator {
	public double add(double a,double b){
		return a+b;
	}
	public double sub(double a,double b){
		return a-b;
	}
	public double mul(double a,double b){
		return a*b;
	}
	public double div(double a,double b){
		return a/b;
	}
}
class Asgmt6_2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Calculator x=new DemoCalculator();
		double r;
		System.out.print("Enter two numbers:");
		double p=sc.nextInt();
		double q=sc.nextInt();
		//while(c){
		System.out.printf("Select the operation you want to perform:\n1.ADD\n2.SUB\n3.MUL\n4.DIV\n5.EXIT\n");
		int c=sc.nextInt();
		switch (c){
			case 1:
				r=x.add(p,q);
				System.out.println("RESULT :"+r);
				break;
			case 2:
				r=x.sub(p,q);
				System.out.println("RESULT :"+r);
				break;
			case 3:
				r=x.mul(p,q);
				System.out.println("RESULT :"+r);
				break;
			case 4:
				r=x.div(p,q);
				System.out.println("RESULT :"+r);
				break;
			case 5:
				System.out.println("EXITING....");
				break;
			default:
				System.out.println("Invalid Input");
		}
		//}
	}
}
				
	