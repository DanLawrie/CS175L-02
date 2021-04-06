package creditCard;

import javax.swing.JOptionPane;

public class CreditCardProcessing {

	public static void main(String[] args) {
		
		String cardNum = JOptionPane.showInputDialog("Enter Credit card number:");
		int i = 0;
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
	    JOptionPane.showMessageDialog(null, cardNum);
	}

}




