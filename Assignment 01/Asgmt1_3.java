//Write a program to input two floating point numbers through the keyboard and display their sum.
import java.io.*;
import java.lang.System;
class Asgmt1_3{
	public static void main(String args[]) throws IOException{
		BufferedReader Br= new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter 1st Number: ");
		float num1= Float.parseFloat(Br.readLine());
		System.out.print("Enter 2nd Number: ");
		float num2= Float.parseFloat(Br.readLine());
		float sum=num1+num2;
		System.out.printf("Sum of %f and %f is: "+sum,num1,num2);
	}
}