import java.util.Scanner;

public class ComputeAngles {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

  		// Prompt the user to enter three points
		System.out.print("Enter three points: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble(); 
		double x3 = input.nextDouble(); 
		double y3 = input.nextDouble();

		// Compute three sides
		// Use the distance between two sides formula 

		// Compute three angles
		// DON'T FORGET TO CONVERT TO DEGREES
		

		System.out.println("The three angles are " + Math.round(A * 100) / 100.0 + " " +
			Math.round(B * 100) / 100.0 + " " +
			Math.round(C * 100) / 100.0);
	}
}