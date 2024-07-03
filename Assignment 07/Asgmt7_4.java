//Write a program to illustrate the use of multiple catch blocks associated with a single try block.
import java.util.*;

class Asgmt7_4{
	public static void main(String[] agrs){
		Scanner sc = new Scanner(System.in);
		double r;
		System.out.print("Enter the size of the array:");
		int n = sc.nextInt();

		double[] a = new double[n];

		System.out.println("Enter the elements of the array:");
		for(int i=0;i<n;i++){
			a[i]=sc.nextDouble();
		}

		System.out.println("Enter the index of the array element you want to divide:");
		int d=sc.nextInt();
		System.out.println("Enter the index of the array element you want to divide with:");
		int div=sc.nextInt();

		try{
			if(d>=n || div>=n){
				throw new ArrayIndexOutOfBoundsException();
			}
			if(a[d]==0 || a[div]==0){
				throw new ArithmeticException();
			}

			else{
				r=a[d]/a[div];
				System.out.println(a[d]+" / "+a[div]+" = "+r);
			}
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("!! Exception Raised !!");
			System.out.println("Index Position is greater than array size.\n["+e+"]");
		}
		catch(ArithmeticException e){
			System.out.println("Divide by zero Exception ["+e+"]");
			System.out.println("\n!!Divisor Can not be Zero!!\n");
		}
	}
}