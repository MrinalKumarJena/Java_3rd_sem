//Q3. Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively by creating a class named 'Rectangle' with a method named 'Area ()' which returns the area.
import java.lang.System;
import java.io.*;
class Rectangle{
int num1,num2;
void input(int a,int b){
num1=a;
num2=b;
}
void Area(){
int area=num1*num2;
System.out.printf("The Area of the rectangle is :%d\n",area);
}
} 
class Asgmt3_3 {
public static void main(String args[]) throws IOException{
Rectangle x=new Rectangle();
int a,b;
x.input(4,5);
x.Area();
x.input(5,8);
x.Area();
}
}