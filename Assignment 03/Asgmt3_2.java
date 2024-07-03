//Q2. Write a program to Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign the value of roll_no as '20' and that of name as "John" by creating an object of the class Student.
class Student{
	String name;
	int roll_no;
	void details(String str, int num){
		name=str;
		roll_no=num;
	}
	void display(){
		System.out.printf("Name: "+ name+ "\n" + "Roll No.: "+roll_no);
	}
}
class Asgmt3_2 {
	public static void main(String args[]){
	Student st = new Student();
	st.details("John",20);
	st.display();
	}
}