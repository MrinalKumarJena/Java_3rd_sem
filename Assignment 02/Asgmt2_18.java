//Write a program to search an element from the array of n integer element.
import java.util.*;
import java.lang.*;

class Asgmt2_18{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the length of array: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			System.out.print("Enter Value: ");
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter the Element to search: ");
		int e=sc.nextInt();
		int cnt=0;
				for(int j=0;j<n;j++){
					if(e==arr[j])
					{
						cnt++;
					}
			    }
			    if(cnt==1){
			    	System.out.printf("Element found");
			    }
			    else
			    {
			    		System.out.printf("Element not found");
			    }
        }
      }
		
		