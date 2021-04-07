package creditCard;

import java.util.Scanner;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class CreditCardProcessing {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Credit Card number or -99 to end:");
		String cardNum = in.nextLine();
		int i = 0;
		while(!cardNum.contentEquals("-99"))
		{
	    while (i < cardNum.length())
	    {
	    char ch = cardNum.charAt(i);
	       if (ch == ' ')         
	       {
	    	   // Remove the character at position i
	          String before = cardNum.substring(0, i);
	          String after = cardNum.substring(i + 1);
	          cardNum = before + after;
	       }
	       else if (ch == '-')         
	       {
	    	   // Remove the character at position i
	          String before = cardNum.substring(0, i);
	          String after = cardNum.substring(i + 1);
	          cardNum = before + after;
	       }
	       else
	       {
	          i++;
	       }
	      
	    }
	    System.out.println(cardNum);
	     System.out.println("Enter Credit card number or -99 to end:");
			 cardNum = in.nextLine();
		}
		
		System.out.println("Goodbye");
		in.close();
	}

}




