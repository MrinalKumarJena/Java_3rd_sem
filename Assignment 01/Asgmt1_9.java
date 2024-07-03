//Write a program to input the principal amount, rate of interest, and the time period through the keyboard and find out the simple interest.
import java.lang.System;
import java.io.*;
class Asgmt1_9 {
	public static void main(String args[]) throws IOException{
		BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the principal amount: ");
		float p=Float.parseFloat(Br.readLine());
		System.out.print("Enter the rate of interest: ");
		float r=Float.parseFloat(Br.readLine());
		System.out.print("Enter the time period (in years): ");
		int t=Integer.parseInt(Br.readLine());
		float i=(p*r*t)/100;
		System.out.printf("For a principal amount of %f for a time period of %d at a rate of %f is "+i,p,t,r);
	}
}