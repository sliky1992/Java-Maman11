/**
 * This program recieves 3 integers from user and checks if the entered lenghts are indeed lengths of a tringle sides.
 * The program also checks what kind of tringle you have based on users's geven lengths.
 * 
 * Equilateral Triangle - all 3 lengths are equal
 * Isosceles Triangle - two sides of the triangle the same length
 * Scalene Triangle - none of the sides have the same length
 * Right triangle - triangle with 90 degrees.
 * 
 * @author (Sergey Popov)
 * 
 * @version (323277517)
 */
import java.util.Scanner;
public class Triangle2 {
    public static void main(String[] args) {
        
        //variables declaration
        Scanner scan = new Scanner(System.in);
        int a,b,c;


        //getting data from the user
        System.out.println("Please enter the three lengths of your triangle: \n");
        System.out.println("Please enter the first length:");
        a = scan.nextInt();
        System.out.println("Please enter the second length:");
        b = scan.nextInt();
        System.out.println("Please enter the third length:");
        c = scan.nextInt();

        //Caculation 

        if((a > 0 && b > 0 && c > 0) && (a + b > c && a + c > b && b + c > a)) // checking if geven lenghts are legit triangle.
        {
                if(a == b && a == c && b == a && b == c && c == a && c == b) // checking if all the lengths are equal.
        {
                 System.out.println("The numbers: " + a + "," + " " + b + " and " + c + " represent an equilateral triangle");
        } 
        if((a == b || b == c || a == c) && !(a == b && a == c && b == a && b == c && c == a && c == b)) //Checking if two of the given lengths are equal
        {
                 System.out.println("The numbers: " + a + "," + " " + b + " and " + c + " represent an isosceles triangle");
        } 
        if((a != b && a != c && b != a && b != c && c != a && c != b) && !(Math.pow(a, 2) + Math.pow(b,2) == Math.pow(c, 2) ||
                 + Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2) ||
                 + Math.pow(c, 2) + Math.pow(a, 2) == Math.pow(b, 2))) //Checking that none of the given lengths are equal
        {
                    System.out.println("The numbers: " + a + "," + " " + b + " and " + c + " represent an common triangle");
        } 
                if(Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) ||
                      + Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2) ||
                      + Math.pow(c, 2) + Math.pow(a, 2) == Math.pow(b, 2)) //Checking if the given triangle is right triangle with Pythagoras Theorem.
        {
                        System.out.println("The numbers: " + a + "," + " " + b + " and " + c + " right-angle triangle");
        }
        } 
        else 
        {
            System.out.println("The numbers: " + a + "," + " " + b + " and " + c + " cannot represent a triangle");
        }         
    }
}