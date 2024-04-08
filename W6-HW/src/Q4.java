public class Q4 {
    /*
    4. Write a Java programme using the following steps.
    4.1 Declare two instance and two static variables.
    4.2 Declare one instance method.
    4.3 Declare one static method.
    4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
    4.5 Declare the Main method.
    4.6 Call both instance and static methods into the Main method and run the programme.
     */
    int in_var1=1; // instance variable
    int in_var2=2; // instance variable
    static int st_var1=3; // static variable
    static int st_var2=4; // static variable
    //main method
    public static void main(String[] args) {
        Q4 q4=new Q4();//create object of class to call instance method in main method;
        StaticMethod();
        q4.InstanceMethod();
    }
    //Instance Method
    public void InstanceMethod(){
        System.out.println("------Instance Method------");
        System.out.println("Instance Variables : "+in_var1+" , "+in_var2+"\nStatic Variables : "+st_var1+" , "+st_var2);//call instance and static variables in instance method.
    }
    //Static Method.
    public static void StaticMethod(){
        Q4 q4=new Q4();//create object of class to call instance variable in static method;
        System.out.println("------Static Method------");
        System.out.println("Instance Variables : "+q4.in_var1+" , "+q4.in_var2+"\nStatic Variables : "+st_var1+" , "+st_var2);//call instance and static variables in static method.
    }
}
