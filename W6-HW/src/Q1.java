public class Q1 {
    /*
    1. Write a Java programme using the following steps.
    1.1 Declare two instance variables.
    1.2 Declare one instance method.
    1.3 Call both instance variables into the instance method inside the print statement.
    1.4 Declare the Main method.
    1.5 Call the above instance method into the Main method and run the programme.
    */
    int var1=1; //Instance Variable
    int var2=2; //Instance Variable
    // Main Method
    public static void main(String[] args) {
        Q1 q1=new Q1(); // class object created.
        q1.InstanceMethod(); //call instance method using class object.
    }
    //Instance Method
    public void InstanceMethod(){
        System.out.println(var1+"\n"+var2);// print instance variable.
    }
}