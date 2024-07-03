//Write a java program, that will create one thread. The main thread will read a number and check the number is prime or composite and the same time the new thread will check the number palindrome or not.
import java.util.*;
class MyThread implements Runnable{
	Thread t;
	int m,n;
	MyThread(int n){
		this.n=n;
		t=new Thread(this, "Num Thread");
		System.out.println("ChildThread:"+t);
	}
	public void run(){
		try{
			int rev=0,t,d;
			t=n;
			while(n!=0){
				d=n%10;
				rev=rev*10+d;
				n=n/10;
			}
			if(rev==t)
			System.out.println("Palindrome");
			else
			System.out.println("Not palindrome");
			Thread.sleep(1);
		}
		catch(InterruptedException e){
			System.out.println("Interrupted Exception");
		}
		System.out.println("Exiting child thread");	
	}
}
class Asgmt8_2{
	public static void main(String args[]){
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number:");
		int p=sc.nextInt();
		MyThread t1 = new MyThread(p);
		t1.t.start();
		try{
			Thread.sleep(1000);
			int cnt=0;
			for(int i=2;i<p;i++){
				if(p%i==0){
					cnt++;
				}
			}
			if(cnt==0){
				System.out.println("The number is prime");
			}
			else{
				System.out.println("The number is composite");
			}
		}
		catch(InterruptedException e){
			System.out.println("Interrupted Exception");
		}
	}
}
				