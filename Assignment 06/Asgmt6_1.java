/*Create a abstract class Bank that has abstract method getROI(). Create two classes SBI, PNB, BOI inherited from Bank. Create a driver class that prints the rate of interest of each bank using super class memory reference. */
import java.util.*; 
abstract class Bank {
	abstract double getROI();
}
class SBI extends Bank {
	double getROI() {
		return 7;
	}
}

class PNB extends Bank {
	double getROI() {
		return 8;
	}
}

class BOI extends Bank {
	double getROI() {
		return 9;
	}
} 

class Asgmt6_1 {
	public static void main (String args[]) {	
	Bank x=new SBI();
	double a=x.getROI();
	System.out.println("The rate of interest of SBI is :"+a);
	
	Bank y=new PNB();
	double b=y.getROI();
	System.out.println("The rate of interest of PNB is :"+b);
	
	Bank z=new BOI();
	double c=z .getROI();
	System.out.println("The rate of interest of BOI is :"+c);
	}
}