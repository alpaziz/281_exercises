public class TestPassObjects {
	public static void main(String[] args) {
		// Create a Circle object with radius 1
		CircleWithPrivateDataFields myCircle = 
			new CircleWithPrivateDataFields(1);

		// Print areas for radius 1, 2, 3, 4, and 5.
		int n = 5; 
		printAreas(myCircle, n);
	}

	// Your void method goes here
}