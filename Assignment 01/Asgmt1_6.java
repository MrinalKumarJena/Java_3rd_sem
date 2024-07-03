//Write a program to input the radius value of a circle through the keyboard and then display the area of the circle.
import java.io.*;
import java.lang.System;

class Asgmt1_6 {
    public static void main(String args[]) throws IOException {
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter radius of the circle: ");
        float r = Float.parseFloat(Br.readLine());
        float area = 3.14f * r * r; 
        System.out.print("Area of the circle is: " + area);
    }
}