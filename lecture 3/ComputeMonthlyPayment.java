import java.util.Scanner;

public class ComputeMonthlyPayment {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		final double ANNUAL_INTEREST = 6.25;


		double monthlyInterestRate = ANNUAL_INTEREST / 1200;

		System.out.print("Enter number of years for the loan: ");
		int numberOfYears = input.nextInt();

		System.out.print("Enter amount for the loan: ");
		double loanAmount = input.nextDouble();

		System.out.println("Your loan is for " + loanAmount + " and for " + numberOfYears);

	}
}