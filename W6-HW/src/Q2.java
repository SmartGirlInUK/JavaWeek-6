public class Q2 {
    /*
    2. Write a Java programme using the following steps.
    2.1 Declare two static variables.
    2.2 Declare one static method.
    2.3 Call both static variables into the static method inside the print statement.
    2.4 Declare the Main method.
    2.5 Call the static method into the Main method and run the programme.
     */
    static int var1=1; //static variable
    static int var2=2; //static variable

    //Main Method.
    public static void main(String[] args) {
        StaticMethod();//call static method.
    }
    //Static Method.
    public static void StaticMethod(){
        System.out.println(var1+"\n"+var2);//call static variables.
    }
}
