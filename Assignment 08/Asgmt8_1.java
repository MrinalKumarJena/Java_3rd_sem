import java.util.*;
class MyThread extends Thread{
	public void run(){
		System.out.println("Inside Thread:"+this.getName());
		System.out.println("Inside Thread:"+this.getId());	
	}
}
class Asgmt8_1{
	public static void main(String args[]){
		MyThread t=new MyThread();
		System.out.println("ID of the thread is:"+t.getName());
		System.out.println("ID of the thread is"+t.getId());
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the thread :");
		String b = sc.next();
		t.setName(b);
		boolean a= t.isAlive();
		if(a==true){
			System.out.println("The thread is Alive");
		}
		else{
			System.out.println("The thread is not Alive");
		}
		t.start();
	}
}
		