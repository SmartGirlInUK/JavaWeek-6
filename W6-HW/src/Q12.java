import java.util.Scanner;

public class Q12 {
    /*
    Write a Java program that takes three numbers as input
    to calculate and print the average of the numbers.
     */
    //main method
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);// Create scanner object to read input from the user

        System.out.print("Please Enter The First Number: ");//Ask user to input number first number
        double a=in.nextDouble();//Read and store value in variable from user
        System.out.print("Please Enter The Second Number: ");//Ask user to input number second number
        double b=in.nextDouble();//Read and store value in variable from user
        System.out.print("Please Enter The Third Number: ");//Ask user to input number third number
        double c=in.nextDouble();//Read and store value in variable from user

        double avg = ( a + b + c ) / 3;//Calculating average of 3 numbers
        System.out.println("Average value of "+a+" , "+b+" and "+c+" is "+avg);//Print average

    }
}
