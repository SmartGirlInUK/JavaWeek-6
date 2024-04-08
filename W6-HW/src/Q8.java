import java.util.Scanner;

public class Q8 {
    /*
    Write a program to insert any temperature value in degree Celsius
    and convert to degree Fahrenheit.
     */
    //main method
    public static void main(String[] Strings) {

        Scanner in = new Scanner(System.in);// Create scanner object to read input from the user

        System.out.print("Please Enter Temperature in Celsius : ");//Ask user to enter value of temp. in celsius

        double c = in.nextDouble();//Read and store value from user into variable.
        double f = ((c*9)/5)+32;//calculate fahrenheit from celsius

        System.out.println(c+" Celsius is equal to " + f + " Fahrenheit");//print value of fahrenheit
    }
}
