public class TestCourse{
	public static void main(String[] args) {
		// Create Instance of Course class

		// Add three individual students

		System.out.println("Number of students in course1:" + course1.getNumberOfStudents());

		// Improve this
		for(String s : course1.getStudents()){
			System.out.println(s + ",");
		}
	}
}