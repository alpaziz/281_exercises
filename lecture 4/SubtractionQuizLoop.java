import java.util.Scanner;

public class SubtractionQuizLoop {
	public static void main(String[] args) {
		final int NUMBER_OF_QUESTIONS 	= 5; // Number of questions
		int correctCount 				= 0; // Count the number of correct
		int count 						= 0; // Count the number of questions
		long startTime 					= System.currentTimeMillis();
		String output 					= " "; // Output string initally empty
		Scanner input 					= new Scanner(System.in);

		// CREAT CONDITION TO STOP LOOP
		while(){
			// 1. Generate two random single digit integers
			

			// 2. If number1 < number2, swap number1 with number2
	

			// 3. Prompt the student to answer "What is number1 – number2?"
			System.out.print(
				"What is " + number1 + " - " + number2 + "? "
			 );
			int answer = input.nextInt();

			// 4. Grade the answer and display the result
			if(){

				// Increate correct answer count
			}

			else
				System.out.println("Your answer is wrong.\n" + number1
					+ " - " + number2 + " should be " + (number1 - number2));

			// Increase the question count

			output = output += "\n" + number1 + "-" + number2 + "=" + answer + ((number1 - number2 == answer) ? " correct" : " wrong");
		}

		long endTime = System.currentTimeMillis();
		long testTime = endTime - startTime;

		System.out.println("Correct count is " + correctCount +
			"\nTest time is " + testTime / 1000 + " seconds\n" + output);
	}
}