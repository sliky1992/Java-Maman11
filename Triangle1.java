/**
 * This program recieves 3 integers from the user and calculates the perimeter and area of triangle.
 * 
 * @author (Sergey Popov)
 * @version (323277517)
 */
import java.util.Scanner;
public class Triangle1 {
    public static void main(String[] args) {
        
        // variable declaration
        Scanner scan = new Scanner(System.in);
        System.out.println("This program calculates the area +"
           + "and the perimeter of a given triangle. " );
        System.out.print("Please enter the three lengths of the triangle's sides");
        int a, b, c;
        int perimeter;
        double area;
        double halfPerimeter;

        //getting data from user
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        //calculation
        perimeter = a + b + c;
        System.out.println("The perimeter of your triangle is: " + perimeter);

        halfPerimeter = perimeter / 2.0;// for the triangle area formula

        area = Math.sqrt(halfPerimeter * (double)(halfPerimeter-a) * (double)(halfPerimeter-b) * (double)(halfPerimeter-c));
        System.out.println("Your triangle area is: " + area);
    }
}