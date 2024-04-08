import java.util.Scanner;

public class Q6 {
    /*
    Write a program to enter any radius value of the circle and find out the area.
     (Formula of Area A=PI*r*r).
     */
    //main method
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);// Create scanner object to read input from the user

        System.out.print("Input the radius of the circle: ");//Ask user to enter value of radius.

        double r = in.nextDouble();//Read and store value of radius into variable.

        System.out.println("Area of circle is : " + (Math.PI * r * r));//Calculate and print area of circle
    }
}
