// Write a program to find out the largest between three numbers using the conditional operator.
import java.lang.System;
import java.io.*;

class Asgmt1_14 {
	public static void main (String args[]) throws IOException{
		BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the First Number: ");
		int a = Integer.parseInt(Br.readLine());
		System.out.print("Enter the Second Number: ");
		int b = Integer.parseInt(Br.readLine());
		System.out.print("Enter the Third Number: ");
		int c = Integer.parseInt(Br.readLine());
		
		if (a>b && a>c) {
			System.out.printf("%d is greater than %d and %d",a,b,c);
		}
		else if (b>a && b>c) {
			System.out.printf("%d is greater than %d and %d",b,a,c);
		}
		else {
			System.out.printf("%d is greater than %d and %d",c,a,b);
		}
	}
}