//Write a program to test whether a number is positive, negative or equal to zero.
import java.util.*;
class Asgmt2_2 {
public static void main (String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number: ");
int num = sc.nextInt();
if (num >0){
System.out.println("The number is positive !!!");
}
else if (num==0){
System.out.println("The number is zero !!!");
}
else {
System.out.println("The number is negative !!!");
}
}
}