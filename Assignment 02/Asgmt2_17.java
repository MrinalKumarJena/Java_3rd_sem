//Write a program to input an integer array of n elements and display the largest and the smallest element in the array.
import java.util.*;
import java.lang.*;

class Asgmt2_17{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the length of array: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			System.out.print("Enter Value: ");
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		for(int i=0;i<n;i++){
			if(max<=arr[i]){
				max=arr[i];
			}
		}
		int min=arr[0];
		for(int j=0;j<n;j++){
			if(min>=arr[j]){
				min=arr[j];
			}
		}
		System.out.printf("LARGEST NUMBER: %d",max);
		System.out.printf("%nSMALLEST NUMBER: %d",min);
	}
} 