// Create a Package btech which has one class Student. Accept student detail through parameterized constructor of Student class.Write a method display ()to display the student details. Create another class Test containing the main method which will use the package btech and calculate total marks and percentage of marks. One sample output is shown below.

import btech.Student;
import java.util.*;

public class Asgmt6_6 {
    public static void main(String args[]) {
        Student obj = new Student(42, "Mrinal");
        obj.display();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        double totalMarks = x + y + z;
        System.out.println("Total Marks: " + totalMarks);
        double percent = totalMarks / 3;
        System.out.println("Percentage: " + percent);
    }
}