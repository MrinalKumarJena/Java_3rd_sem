//Write a program to find out the area of any rectangle.
import java.lang.System;
import java.io.*;
class Asgmt1_7 {
	public static void main(String args[]) throws IOException{
		BufferedReader Br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the length of Rectangle: ");
		float length=Float.parseFloat(Br.readLine());
		System.out.print("Enter the width of Rectangle: ");
		float width=Float.parseFloat(Br.readLine());
		float area= length*width;
		System.out.print("Area of the Rectangle is: "+area);
	}
}