import java.util.Scanner;

public class Q15 {
    /*
    Write a Java program to convert a given string into lowercase.
    Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
    Output: the quick brown fox jumps over the lazy dog.
     */
    //main method
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);// Create scanner object to read input from the user

        System.out.print("Please Enter String in Uppercase : ");//Ask user to input string
        String str=in.nextLine();//Read and store value in variable from user

        System.out.println("Your string in lowercase : "+str.toLowerCase());//Convert and print string to lowercase
    }
}
