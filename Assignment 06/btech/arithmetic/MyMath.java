//Create a sub-package called arithmetic under the package btech. The arithmetic package should contain a class MyMath having methods to deal with different arithmetic operations (addition, subtraction, multiplication, division and mod). Create a class Test containing the main method which will use the methods of sub-package arithmetic.
package btech.arithmetic;
public class MyMath{
	double a,b;
    public MyMath(double a, double b){
    	this.a=a;
    	this.b=b;
    }
	public double add(double a,double b){
		return a+b;
	}
	public double sub(double a,double b){
		return a-b;
	}
	public double mul(double a,double b){
		return a*b;
	}
	public double div(double a,double b){
		return a/b;
	}
}
