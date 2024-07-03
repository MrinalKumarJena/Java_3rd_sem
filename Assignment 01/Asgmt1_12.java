//Write a program to enter the distance value in meters and then display it in Km: Meter format using the modulus operator.
import java.lang.System;
import java.io.*;

class Asgmt1_12 {
	public static void main (String args[]) throws IOException {
		BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the Distance in Meters: ");
		int m = Integer.parseInt(Br.readLine());
		int km = m/1000;
		m = m%1000;
		System.out.printf(" Distance: %d Kms %d Mtrs",km,m);
	}
}