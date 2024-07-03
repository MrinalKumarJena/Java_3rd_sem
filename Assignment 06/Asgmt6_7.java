//Create a sub-package called arithmetic under the package btech. The arithmetic package should contain a class MyMath having methods to deal with different arithmetic operations (addition, subtraction, multiplication, division and mod). Create a class Test containing the main method which will use the methods of sub-package arithmetic.

import java.util.*;
import btech.arithmetic.MyMath;
class Asgmt6_7{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double r;
		System.out.print("Enter two numbers:");
		double p=sc.nextInt();
		double q=sc.nextInt();
		MyMath x=new MyMath(p,q);
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
