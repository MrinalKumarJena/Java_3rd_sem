//Write a program to convert the temperature from Fahrenheit scale to Celsius scale.
import java.lang.System;
import java.io.*;

class Asgmt1_10{
    public static void main(String[] args) throws IOException {
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the temperature in Fahrenheit scale: ");
        float tempinf = Float.parseFloat(Br.readLine());
        float tempinc = (tempinf - 32) * 5/9f;
        System.out.printf("%.2f Fahrenheit in Celsius scale is %.2f\n", tempinf, tempinc);
    }
}
