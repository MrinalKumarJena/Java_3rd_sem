//Q1.  Write a program to Print the average of three numbers entered by user by creating a class named 'Average' having a method to calculate and print the average. Define another driver class to demonstrate the basic operation.
import java.lang.System;
import java.io.*;
import java.util.*;
class Average{
int num1,num2,num3;
void input(int a,int b, int c){
num1=a;
num2=b;
num3=c;
}
void avg(){
int avg=(num1+num2+num3)/3;
System.out.printf("The average is :%d",avg);
}
} 
class Asgmt3_1 {
public static void main(String args[]) throws IOException{
Average x=new Average();
Scanner sc=new Scanner(System.in);
int a,b,c;
System.out.print("Enter the first number:");
a=sc.nextInt();
System.out.print("Enter the second number:");
b=sc.nextInt();
System.out.print("Enter the third number:");
c=sc.nextInt();
x.input(a,b,c);
x.avg();
}
}