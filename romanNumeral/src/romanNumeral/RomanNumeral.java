package romanNumeral;



import javax.swing.JOptionPane;

public class RomanNumeral {

	public static void main(String[] args) {
		String one = JOptionPane.showInputDialog("Enter a number");
	    int num = Integer.parseInt(one);
	    
	    String roman = "";

		int y = 0;
		if(num < 4000) 
		{
//M
			if(num >= 1000)
			{
				y = num%1000;
				y = num-y;
				for(int p = y/1000; p > 0; p--)
				{
				roman = roman + "M";
				}
				num = num%1000;

			}
			if(num >= 900)
			{
				roman = roman + "CM";
				num -= 900;
			}
//D
			if(num >= 500)
			{
				y = num%500;
				y = num-y;
				for(int p = y/500; p > 0; p--)
				{
				roman = roman + "D";
				}
				num = num%500;

			}
			if(num >= 400)
			{
				roman = roman + "CD";
				num -= 400;
			}
//C
			if(num >= 100)
			{
				y = num%100;
				y = num-y;
				for(int p = y/100; p > 0; p--)
				{
				roman = roman + "C";
				}
				num = num%100;
				
			}
			if(num >= 90)
			{
				roman = roman + "XC";
				num -= 90;
			}
			
			//L
			if(num >= 50)
			{
				y = num%50;
				y = num-y;
				for(int p = y/50; p > 0; p--)
				{
				roman = roman + "L" ;
				}
				num = num%50;
			}
			if(num >= 40)
			{
				roman = roman + "XL";
				num -= 40;
			}
			//X
			if(num >= 10)
			{
				y = num%10;
				y = num-y;
				for(int p = y/10; p > 0; p--)
				{
				roman = roman + "X";
				}
				num = num%10;

			}
			if(num >= 9)
			{
				roman = roman + "IX";
				num -= 9;
			}
			//V
			if(num >= 5)
			{
				y = num%5;
				y = num-y;
				for(int p = y/5; p > 0; p--)
				{
				roman = roman + "V";
				}
				num = num%5;
				
			}
			if(num >= 4)
			{
				roman = roman + "IV";
				num -= 4;
			}
			//I
			if(num >= 1)
			{
				y = num%1;
				y = num-y;
				for(int p = y/1; p > 0; p--)
				{
				roman = roman + "I";
				}
				num = num%1;
				
			}


			JOptionPane.showMessageDialog(null, "This is " + roman);
		}
	}
		

	}


