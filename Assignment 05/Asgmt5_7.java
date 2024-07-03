/*Create a class Student having data members name, roll and address. Note that address is an object of inner class Address having data members city and pin. Create some student class objects. Read, store (using constructor) and display their information. While creating the objects your program should display a message “Creating student number n” from the constructor. You can get the value of n by using a static member of Student class which is initialized to 0.*/
import java.util.*;

class Student{
	static int n=0;
	class Address {
	 	String city;
	 	int pin;
	 	Address(String city, int pin){
	 		this.city=city;
	 		this.pin=pin;
	    }
	 }
	String name;
	int roll;
	Address address;
	
	Student(String name, String city, int pin, int roll){
		this.name = name;
		this.address = new Address(city,pin);
		this.roll = roll;
	}  
	void Display(){
		n++;
		System.out.println("Creating Student Number "+n);
		System.out.println("NAME:"+name);
		System.out.println("ROLL:"+roll);
		System.out.println("CITY:"+address.city);
		System.out.println("PIN:"+address.pin);
	}
}

class Asgmt5_7{
	public static void main(String args[]){
		Student student1=new Student("Mrinal", "Patia", 42, 750210);
		Student student2=new Student("Vivek", "Jharpada", 48, 751006);
		
		System.out.println("Information of student "+(Student.n+1));
		student1.Display();
		System.out.println("information of student "+(Student.n+1));
		student2.Display();
	}
}
	
