/* Write a program to calculate tax, given the following conditions:
                 If income is less than 150000 then no tax
                 If taxable income is in the range 150001 to 300000 then charge 10% tax
                 If taxable income is in the range 300001 to 500000 then charge 20% tax
                 If taxable income is above 500001 then charge 30% tax */
import java.util.*;
class Asgmt2_3 {
public static void main (String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter Your Income : ");
int income = sc.nextInt();
if (income <= 150000){
System.out.println("No tax !!!");
}
else if (income >=150001 && income <300000){
System.out.println("tax is :"+ 0.1f*income);
}
else if (income >=300001 && income <500000){
System.out.println("tax is :"+ 0.2f*income);
}
else {
System.out.println("tax is :"+ 0.3f*income);
}
}
}