import java.util.Scanner;

public class Q7 {
    /*
    Write a program to insert any temperature value in degree Fahrenheit
    and convert to degree Celsius ((F − 32) × 5/9 = 0°C).
     */
    //main method
    public static void main(String[] Strings) {

        Scanner in = new Scanner(System.in);// Create scanner object to read input from the user

        System.out.print("Please Enter Temperature in Fahrenheit : ");//Ask user to enter value of temp. in fahrenheit

        double f = in.nextDouble();//Read and store value from user into variable.
        double c = ((5 * (f - 32.0)) / 9.0);//calculate celsius from fahrenheit

        System.out.println(f+" Fahrenheit is equal to " + c + " Celsius");//print value of celsius
    }
}
