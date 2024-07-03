//Write a program to check whether an inputted number is positive or negative.
import java.util.*;
class Asgmt2_1 {
public static void main (String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number: ");
int num = sc.nextInt();
if (num >= 0){
System.out.println("The number is positive !!!");
}
else {
System.out.println("The number is negative !!!");
}
}
}