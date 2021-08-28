/* Exercise 5: Write a Java program to display the Diameter, Circumference and Area of a circle. 
Test Data
Radius value: 6
Expected Output
Diameter of a circle : 12.0
Circumference of a circle: 37.68
Area of a Circle: 113.04 */

import java.util.Scanner;

public class Circle {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);
		float r, d, C, A;
		System.out.print("Enter radius of the circle: ");
		r = input.nextFloat();
		d = 2 * r;
		C = 2 * 3.14f * r;
		A = 3.14f * r * r;
		System.out.println("Diameter of the circle is " + d);
		System.out.println("Circumference of the circle is " + C);
		System.out.println("Area of the circle is " + A);
	}
}
