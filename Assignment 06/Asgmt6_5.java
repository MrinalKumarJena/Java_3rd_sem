/*Create an interface Servicing that has abstract methods getServiceTime(). Create two class Car, Bike that implement interface. Create a driver class that creates the objects of two class and displays the service time.*/

import java.util.*;

interface Servicing{
	abstract void getServiceTime();
}

class car implements Servicing{
	public void getServiceTime(){
		System.out.println("Servicing time for Car: 2 Days.");
	}
}

class bike implements Servicing{
	public void getServiceTime(){
		System.out.println("Servicing time for Bike: 1 Day.");
	}
}

class Asgmt6_4{
	public static void main(String args[]){
		car x = new car();
		x.getServiceTime();
		bike y = new bike();
		y.getServiceTime();
	}
}