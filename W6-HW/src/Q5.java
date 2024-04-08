public class Q5 {
    /*
    Write a program for a calculator with addition, subtraction, multiplication, and division
     methods all with parameters and use string concatenation methods.
     (Note: Two static and Two instance methods.)
     */
    //main method
    public static void main(String[] args) {
        Q5 q5 = new Q5();// create class object
        q5.addition(10,20);//call instance method using object
        q5.subtraction(20,5);//call instance method using object
        multiplication(5,15);//call static method
        division(20,10);//call static method
    }

    //instance method with parameter
    public void addition(int num1,int num2) {
        System.out.println("Addition of "+num1+" and "+num2+" is "+(num1+num2));
        //print addition of two numbers.
    }

    //instance method with parameter
    public void subtraction(int num1,int num2) {
        System.out.println("Subtraction of "+num1+" and "+num2+" is "+(num1-num2));
        //print subtraction of two numbers.
    }

    //static method with parameter
    public static void multiplication(int num1,int num2) {
        System.out.println("Multiplication of "+num1+" and "+num2+" is "+(num1*num2));
        //print multiplication of two numbers.
    }

    //static method with parameter
    public static void division(int num1,int num2) {
        System.out.println("Division of "+num1+" and "+num2+" is "+(num1/num2));
        //print division of two numbers.
    }
}
