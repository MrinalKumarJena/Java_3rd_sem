//Write a program to find out the largest between two numbers using a conditional operator.
import java.lang.System;
import java.io.*;

class Asgmt1_13 {
	public static void main (String args[]) throws IOException {
		BufferedReader Br= new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the First Number: ");
		int a=Integer.parseInt(Br.readLine());
		System.out.print("Enter the Second Number: ");
		int b=Integer.parseInt(Br.readLine());
		if (a>b) {
			System.out.printf("%d is larger than %d.",a,b);
		}
		else if (a==b) {
			System.out.printf("%d is equal to %d.",a,b);
		}
		else {
			System.out.printf("%d is larger than %d.",b,a);
		}
	}
}
