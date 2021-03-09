package roaches;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class RoachSimulation {
		
		
	public static void main(String[] args) {
/**
 * creating object and getting initial
 */
		String one = JOptionPane.showInputDialog("Enter starting roach population ");
		int inital = Integer.parseInt(one);
	      RoachPopulation bugs = new RoachPopulation(inital);
	      	
	      JOptionPane.showMessageDialog(null, "The initial roach population is " + bugs.getroaches());

		 /**
		  * loop
		  */
		 
		 for(int i = 1; i<= 4; i++)
		 {
		bugs.breed();
		      	
		JOptionPane.showMessageDialog(null, "The roach population after cycle " + i + " breeding is  " + bugs.getroaches()); 
		
		String two = JOptionPane.showInputDialog("Enter the spray percentage for cycle " + i);
		int pct = Integer.parseInt(two);
		bugs.spray(pct);
		      	
		JOptionPane.showMessageDialog(null, "The roach population after cycle" + i +" " + pct + " percent spraying is " + bugs.getroaches());
		


		 }

		      
		      
	     
	      
	      
	}

}
