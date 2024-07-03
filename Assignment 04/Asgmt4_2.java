//Design a class ‘ComplexNum’ to manipulate Complex numbers having data members as real and img. The class should have a parameterized constructor to initialize its data members. It should also have methods displayCompNumber() to display the complex number (in the format 5+3i for example), addCompNumber() to add two Complex numbers. Test these methods by creating main method in another class.
import java.util.*;
class ComplexNum {
    int real, img;
    ComplexNum(int r, int i) {
        real = r;
        img = i;
    }
    ComplexNum addCompNumber(ComplexNum c1, ComplexNum c2) {
        ComplexNum result = new ComplexNum(0, 0);
        result.real = c1.real + c2.real;
        result.img = c1.img + c2.img;
        return result;
    }
    void displayCompNumber() {
        System.out.print("Sum: "+real + " + " + img + "i");
    }
}
class Asgmt4_2{
    public static void main(String args[]) {
        int p, q, r, s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the real and imaginary part of the first number: ");
        p = sc.nextInt();
        q = sc.nextInt();
        ComplexNum a = new ComplexNum(p, q);
        System.out.print("Enter the real and imaginary part of the second number: ");
        r = sc.nextInt();
        s = sc.nextInt();
        ComplexNum b = new ComplexNum(r, s);
        ComplexNum c = a.addCompNumber(a, b);
        c.displayCompNumber();
    }
}