//Write a program to input 2 integer and find their GCD
import java.util.*;
class Asgmt2_16{
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int num1=sc.nextInt();
		System.out.print("Enter the second number:");
		int num2=sc.nextInt();
		int min=0;
		if(num1>=num2)
		{
			min=num1;
		}
		else
		{
			min=num2;
		}
		int max=0;
		for(int i=1;i<min;i++)
		{
			if(num1%i==0&&num2%i==0)
			{
				max=i;
			}
		}
		System.out.print("GCD:"+max);
	}
}