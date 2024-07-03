//Write a program to swap two numbers using a third variable.
import java.io.*;
import java.lang.System;
class Asgmt1_4{
	public static void main(String args[]) throws IOException{
		BufferedReader Br= new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter 1st Number: ");
		int a= Integer.parseInt(Br.readLine());
		System.out.print("Enter 2nd Number: ");
		int b= Integer.parseInt(Br.readLine());
		System.out.printf("Before swapping 1st number: %d and 2nd number: %d",a,b);
		int c=a;
		a=b;
		b=c;
		System.out.printf("After swapping 1st number: %d and 2nd number: %d",a,b);
	}
}