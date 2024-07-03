// Write an exception handling java program to read two numbers n1, n2 and calculate and print the result of n1/n2. If n2 is Zero (0) then it will be handled by exception handler and again ask the value of n2. In the exception handler the program should display appropriate message to the user.
import java.util.*;
class Asgmt7_1{
	public static void main(String args[]){
		int n1, n2, r;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:");
		n1=sc.nextInt();
		System.out.println("Enter the second number:");
		n2=sc.nextInt();
		try{
			 r=n1/n2;
		}
		catch(ArithmeticException e){
			System.out.println("Divide by zero exception"+e);
		    System.out.println("Divison can not be zero");
		    System.out.println("Enter the number again:");
		    n2=sc.nextInt();
		    r=n1/n2;
		}
		System.out.println("The result is:"+r);
	}
}
	

		