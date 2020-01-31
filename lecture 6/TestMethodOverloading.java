public class TestMethodOverloading {
	public static void main(String[] args) {
		// Invoke the max method with int parameters
		System.out.println("The maximum of 3 and 4 is "
			+ max(3, 4));
		
		// Invoke the max method with the double parameters
		System.out.println("The maximum of 3.0 and 5.4 is " + max(3.0, 5.4));
		
		// Invoke the max method with three double parameters
		System.out.println("The maximum of 3.0, 5.4, and 10.14 is " + max(3.0, 5.4, 10.14));

	}

	// Create your three methods here
}