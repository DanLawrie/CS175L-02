package ageCalculation;
import javax.swing.JOptionPane;
import java.util.Date;
import java.text.SimpleDateFormat;


public class AgeCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String one = JOptionPane.showInputDialog("Enter your birthday (MM/DD/YYYY)");
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		String today = sdf.format(new Date());
		
		String todaymonth = today.substring(0, 2);
		String todayday = today.substring(3, 5);
		String todayyear = today.substring(6, 10);
		
		
		
		String month = one.substring(0, 2);
		String day = one.substring(3, 5);
		String year = one.substring(6, 10);
		
		int months = Integer.parseInt(month);
		int days = Integer.parseInt(day);
		int years = Integer.parseInt(year);
		
		int todaymonths = Integer.parseInt(todaymonth);
		int todaydays = Integer.parseInt(todayday);
		int todayyears = Integer.parseInt(todayyear);
		
		
		months = todaymonths - months;
		int agedays = todaydays - days;
		
		if(years%4 == 0)
		{
			if(months >= 3)
			{
				agedays++;
			}
		}
		years = todayyears - years;
		if( months < 0)
		{
			years--;
			months = 12+ months;
		}
		if (agedays < 0)
		{
			months--;
			
			
		}
		
		
		
		
		JOptionPane.showMessageDialog(null, "You are "  + years + " years and " + months + " month(s) old");
	   
		


	     
	}
	



}
