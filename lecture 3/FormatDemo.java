
public class FormatDemo {
	public static void main(String[] args) {
		
		// Display the header of the table
		System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", "Degrees",
		 "Radians", "Sine", "Cosine", "Tangent");

		// Display values for 30 degrees
		int degrees 	= 30;
		double radians 	= Math.toRadians(degrees);
		System.out.printf();

		// Display values for 60 degrees
		degrees 	= 60;
		radians 	= Math.toRadians(degrees);
		System.out.printf();
	}
}