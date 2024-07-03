// Create a Package btech which has one class Student. Accept student detail through parameterized constructor of Student class.Write a method display ()to display the student details. Create another class Test containing the main method which will use the package btech and calculate total marks and percentage of marks. One sample output is shown below.
package btech;
public class Student{
	int roll;
	String name;
	public Student(int roll, String name){
		this.roll=roll;
		this.name=name;
	}
	public void display(){
		System.out.println("NAME :"+name);
		System.out.println("ROLL NO :"+roll);
	}
} 