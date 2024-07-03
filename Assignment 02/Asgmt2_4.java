/*Write a program to enter the marks of a student in 4 different subjects. Then display the grade   
        Of the student as per the following conditions:
                 If the average mark is greater than or equal to 90 then grade is O
                 If the average mark is greater than equal to 80 but less than 90 then grade is E
                 If the average mark is greater than equal to 70 but less than 80 then grade is A
                 If the average mark is greater than equal to 60 but less than 70 then grade is B
                 If the average mark is greater than equal to 50 but less than 60 then grade is C
                 If the average mark is less than 50 then grade is F */
import java.util.*;
class Asgmt2_4 {
public static void main (String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter Your Marks in 4 diff subs: ");
int msub1= sc.nextInt();
int msub2= sc.nextInt();
int msub3= sc.nextInt();
int msub4= sc.nextInt();
int avg=(msub1+msub2+msub3+msub4)/4;
System.out.println("The average mark is :"+avg);
if (avg>=90){
System.out.println("O grade !!!");
}
else if (avg >=80 && avg <90){
System.out.println("E grade");
}
else if (avg >=70 && avg <80){
System.out.println("A grade");
}
else if (avg >=60 && avg <70){
System.out.println("B grade");
}
else if (avg >=50 && avg <60){
System.out.println("C grade");
}
else{
System.out.println("F grade");
}
}
}                 