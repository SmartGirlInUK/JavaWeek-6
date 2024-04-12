import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Q16 {
    /*
    Write a Java Program to print as below. (All details to be stored in variable)
"+------------------------+"
"|                          |"
"| CORNER STORE             |"
"|                          |"
"| 2015-03-29 04:38PM       |"
"|                          |"
"|   Gallons: 10.870        |"
"| Price/gallon: $ 2.89     |"
"|                          |"
"| Fuel total: $ 22.71      |"
"|                          |"
"+------------------------+"
     */
    //main method
    public static void main(String[] args) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mma");//get currant date and time in format
        Date d = new Date();//get date
        //create two variable to store value
        double g=10.870;
        double pr=2.089;
        double total=g * pr;//calculate total

        //print corner store receipt for fuel
        System.out.println("+------------------------+");
        System.out.println("|                        |");
        System.out.println("|      CORNER STORE      |");
        System.out.println("+------------------------+");
        System.out.println("| " +df.format(d)+ "     |");//print currant date and time
        System.out.println("|                        |");
        System.out.println("| Gallons:      "+g+"    |");
        System.out.println("| Price/gallon: $ "+pr+"  |");
        System.out.println("|                        |");
        System.out.println("+------------------------+");
        System.out.println("| Fuel total: $ "+total+" |");
        System.out.println("+------------------------+");

    }
}
