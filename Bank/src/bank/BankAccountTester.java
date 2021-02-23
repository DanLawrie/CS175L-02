package bank;
import java.util.Scanner;
public class BankAccountTester {
double balance = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter starting balance: ");
		double startBal = in.nextDouble();
		BankAccount myBankAccount = new BankAccount(startBal);
		
		System.out.print("Enter how much you would like to withdraw: ");
		double withdrawal = in.nextDouble();
		myBankAccount.withdraw(withdrawal);
		
		System.out.print("Enter how much you would like to deposit: ");
		double deposit = in.nextDouble();
		myBankAccount.deposit(deposit);
		
		
		System.out.println("Your balance is: $" + myBankAccount.balance);
			
		
	}

}
