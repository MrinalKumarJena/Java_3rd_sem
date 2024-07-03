//Write a java program to read two numbers x and y and calculate x/(x−y). The program should check the value of x−y. Before dividing with x, it should throw an exception if x−y is zero. In the exception handler the program should display appropriate message to the user.
import java.util.*;
class Asgmt7_2{
	public static void main(String args[]){
		int x, y, r;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:");
	    x=sc.nextInt();
		System.out.println("Enter the second number:");
		y=sc.nextInt();
		try{
			if(x-y==0){
				throw new ArithmeticException();
			}
			else
			 r=x/(x-y);
		}
		catch(ArithmeticException e){
			System.out.println("Divide by zero exception"+e);
		    System.out.println("Divison can not be zero");
		    System.out.println("Enter the number again:");
		    y=sc.nextInt();
		    r=x/(x-y);
		}
		System.out.println("The result is:"+r);
	}
}
