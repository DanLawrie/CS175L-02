package bank;

import java.util.Scanner;


public class BankThreshold {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter starting balance: ");
		double startBal = in.nextDouble();
		System.out.print("Enter the interest: ");
		double interestPct = in.nextDouble();
		BankAccount myBankAccount = new BankAccount(startBal, interestPct);
		
		
		System.out.print("Enter a threshold: ");
		while (in.hasNextDouble()){
			int months = 0;
			double threshold = in.nextDouble();
		while (myBankAccount.getBalance() < threshold)
		{
			myBankAccount.calcInterest(threshold);
			months++;
		}
		System.out.println("It will take " + months + " months to reach the threshold");
		System.out.print("Enter a threshold: ");
		}
	}

}
