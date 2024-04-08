import java.util.Scanner;

public class Q9 {
    /*
    Write a program to convert the upper case to lower case.
     */
    //main method
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);// Create scanner object to read input from the user

        System.out.print("PLEASE ENTER ANY WORD IN UPPER CASE : ");//Ask a user for input in upper case

        String str=in.next();//Read and store value in variable

        System.out.println("In lower case : " + str.toLowerCase());//Convert to lower case and print

    }
}
