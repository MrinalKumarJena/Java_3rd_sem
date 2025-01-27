//Write a program that will take two integer numbers from the command prompt and find their GCD and LCM. If the user does not provide
// exactly two numbers of argument then the program should display error message. in Java 

import java.util.*;

class GCD_LCM {
    static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static int calculateLCM(int a, int b) {
        int gcd = calculateGCD(a, b);
        if (gcd != 0) {
            return (a * b) / gcd;
        } else {
            return 0;
        }
    }
}

class Asgmt4_7{
    public static void main(String args[]) {
        if (args.length != 2) {
            System.out.println("Invalid number of arguments");
        } 
		else {
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);
            int hcf = GCD_LCM.calculateGCD(x, y);
            int lcm = GCD_LCM.calculateLCM(x, y);
            System.out.println("GCD: " + hcf);
            System.out.println("LCM: " + lcm);
        }
    }
}