//Write an exception handling java program to print the index position of an existing integer array. The index value will be entered by user. It will be handled by exception handler if index position is greater then the size of array. In the exception handler the program should display appropriate message to the user. 
import java.util.*;
class Asgmt7_3{
	public static void main(String args[]){
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		n=sc.nextInt();
		int Arr[]=new int[n];
		System.out.println("Enter the values:");
		for(int i=0;i<n;i++){
			Arr[i]=sc.nextInt();
		}
		System.out.println("Enter the index of the value to print:");
		int index=sc.nextInt();
		try{
			if(index>=n)
			{
				throw new ArrayIndexOutOfBoundsException();
			}
			else {
				System.out.println("The element is:"+Arr[index]);
           }	 
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Exception!!"+e);
		    System.out.println("Size of the array is "+n);
		    System.out.println("Enter the index again:");
		    index=sc.nextInt();
		    System.out.println("The element is:"+Arr[index]);
		}
	}
}