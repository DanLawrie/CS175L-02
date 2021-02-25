package bank;
import java.util.Scanner;
public class BankAccountTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter starting balance: ");
		double startBal = in.nextDouble();
		System.out.print("Enter the interest: ");
		double interestPct = in.nextDouble();
		BankAccount myBankAccount = new BankAccount(startBal, interestPct);
		System.out.println("Created new account with "+ myBankAccount.balance +" balance and interest rate " + myBankAccount.interestPct);
		
		System.out.print("Enter how much you would like to deposit: ");
		double deposit = in.nextDouble();
		myBankAccount.deposit(deposit);
		
		
		System.out.print("Enter how much you would like to withdraw: ");
		double withdrawal = in.nextDouble();
		myBankAccount.withdraw(withdrawal);
		
		
		System.out.print("Enter how much you would like to withdraw: ");
		double withdrawal2 = in.nextDouble();
		myBankAccount.withdraw(withdrawal2);
		
		System.out.print("If you want me to generate interest, enter 'yes': ");
		String gen = in.next();
		if((gen.toLowerCase()).equals("yes"))
		{
		myBankAccount.calcInterest();
		}
		System.out.println("Your balance is: $" + myBankAccount.balance);
			
		
	}

}
