//Write a program to find out the sum of the individual digits of any four-digit integer number.
import java.lang.System;
import java.io.*;

class Asgmt1_15 {
    public static void main(String args[]) throws IOException {
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a 4-digit number: ");
        int num = Integer.parseInt(Br.readLine());
		int number=num;
        int sum = 0;
        while (num > 0) {
			int rem = num % 10;
			sum += rem;
			num = num / 10;
        }
        System.out.printf("Sum of digits of %d is: %d",number, sum);
    }
}
