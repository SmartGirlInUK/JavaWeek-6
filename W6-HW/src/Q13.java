public class Q13 {
    /*
    Write a Java program to print the area and perimeter of a rectangle.
    Test Data:
        Width = 5.6 Height = 8.5
    Expected Output:
        Area is 5.6 * 8.5 = 47.60
        Perimeter is 2 * (5.6 + 8.5) = 28.20
     */
    //main method
    public static void main(String[] args) {
        //Create two variable for height and width
        double width=5.6;
        double height=8.5;

        double area = width * height;//Calculate the area of the rectangle
        double perimeter = 2 * ( height + width );//Calculate the perimeter of the rectangle

        System.out.println("Area is "+width+" * "+height+" = "+area);//Print area of rectangle
        System.out.println("Perimeter is 2 * ( "+width+" + "+height+" ) = "+perimeter);//Print perimeter of rectangle
    }
}
