// Write a program to sort an array of integer using bobble sort.
import java.util.*;
import java.lang.*;

class Asgmt2_19 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Value: ");
            arr[i] = sc.nextInt();
        }
		int temp;
		for(int i=0;i<n;i++){
			for(int j=0;j<n-i-1;j++){
				if(arr[j]>arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.print("After Bubble Sort Array: ");
		for (int i = 0; i < n; i++) {
            System.out.printf("%d ",arr[i]);
        }
	}
}