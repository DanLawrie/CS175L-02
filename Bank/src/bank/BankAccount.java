package bank;

public class BankAccount {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
		
		  protected double balance;
		  double interestPct;
		   /**
		      Constructs a bank account with zero balance.
		   */
		   public BankAccount(double amount, double interestpct)
		   {
		      balance = amount;
		      interestPct = interestpct;
		   }

		   /**
		      Makes a deposit into this account.
		      @param amount the amount of the deposit
		   */
		   public void deposit(double amount)
		   {
		      balance = balance + amount;
		      System.out.println("Deposited: " + amount);
		   }

		   /**
		      Makes a withdrawal from this account, or charges a penalty if
		      sufficient funds are not available.
		      @param amount the amount of the withdrawal
		   */
		   public double withdraw(double amount)
		   {
			   if(balance < amount)
			   {
				   System.out.println("Insufficient Funds to support withdrawal");
			   }
			   else {
				   balance = balance - amount;
				   System.out.println("Withdrew: " + amount);
			   }
		      return balance;
		   }
		   /**
		      Gets the current balance of this bank account.
		      @return the current balance
		   */
		   public double getBalance()
		   {
		      return balance;
		   }
		   public double calcInterest()
		   {
			   double totInterest = (balance*interestPct);
			   System.out.println("Interest: "+ totInterest);
			   balance = balance + totInterest;
			   return balance;
		   }
		}

	

