public class Q3 {
    /*
    3. Write a Java programme using the following steps.
    3.1 Declare one instance and one static variable.
    3.2 Declare one instance method.
    3.3 Declare one static method.
    3.4 Call both instance and static variables into both instance and static methods inside the print statement.
    3.5 Declare the Main method.
    3.6 Call both instance and static methods into the Main method and run the programme.
     */
    int in_var=1; //instance variable
    static int st_var=2;//static variable
    //main method
    public static void main(String[] args) {
        Q3 q3=new Q3();//create object of class to call instance method in main method;
        StaticMethod();
        q3.InstanceMethod();
    }
    //Instance Method
    public void InstanceMethod(){
        System.out.println("------Instance Method------");
        System.out.println("Instance Variable : "+in_var+"\nStatic Variable : "+st_var);//call instance and static variable in instance method.
    }
    //Static Method.
    public static void StaticMethod(){
        Q3 q3=new Q3();//create object of class to call instance variable in static method;
        System.out.println("------Static Method------");
        System.out.println("Instance Variable : "+q3.in_var+"\nStatic Variable : "+st_var);//call instance and static variable in static method.
    }
}
