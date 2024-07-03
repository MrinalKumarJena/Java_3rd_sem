//Write a program to find the factorial of numbers from 1 to n.
import java.util.*;
class Asgmt2_22 {
    static int factorial(int a){
        int fact = 1;
        for(int i = 1; i <= a; i++){
            fact = fact * i;
        }
        return fact;  
    }    
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int num = sc.nextInt();
        for(int i = 1; i <= num; i++){
            System.out.printf("%d ", factorial(i)); 
        }
    }
}