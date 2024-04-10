import java.util.Scanner;

public class Q14 {
    /*
    Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
     Test Data:
        Input first number: 125
        Input second number: 24
     Expected Output: 125 + 24 = 149
                      125 - 24 = 101
                      125 x 24 = 3000
                      125 / 24 = 5
                      125 mod 24 = 5
     */
    //main method
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);// Create scanner object to read input from the user

        System.out.print("Please Enter The First Number: ");//Ask user to input number first number
        int num1=in.nextInt();//Read and store value in variable from user
        System.out.print("Please Enter The Second Number: ");//Ask user to input number second number
        int num2=in.nextInt();//Read and store value in variable from user

        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));//Calculate and print the sum of the two numbers

        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));//Calculate and print the difference of the two numbers

        System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));//Calculate and print the product of the two numbers

        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2)); //Calculate and print the division of the two numbers

        System.out.println(num1 + " mod " + num2 + " = " + (num1 % num2));//Calculate and print the remainder of the division of the two numbers
    }
}
