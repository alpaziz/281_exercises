import java.util.Scanner;

public class SubtractionQuiz {
	public static void main(String[] args) {
		// 1. Generate two random single-digit integers
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);

		// 2. If number1 < number2, swap number1 with number2
		if(number1 < number2) {
			// START HERE!!!!
			//Implement swapping

		}

		// 3. Prompt the student to answer "What is number1 - number2?"
		System.out.print
			("What is " + number1 + " - " + number2 + "? ");
		Scanner input	= new Scanner(System.in);
		int answer 		= input.nextInt();

		// 4. Grade the answer and display the result
		// USE CONDITIONALS
	}
}