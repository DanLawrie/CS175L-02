package helloWorld;
import java.util.Scanner;


public class Paint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dan = new Scanner(System.in);
				
		
		System.out.println("Enter the cost of paint per sqr/ft");
		double paintCost = dan.nextDouble();
		
		System.out.println("Input the length of the walls");
		double length = dan.nextDouble();
		
		System.out.println("Input the width of the walls");
		double width = dan.nextDouble();

		System.out.println("Input the height of the walls");
		double height = dan.nextDouble();
		
		System.out.println("Input the number of windows");
		double numWindow = dan.nextDouble();
		
		System.out.println("Input the window length");
		double windowlength = dan.nextDouble();
		
		System.out.println("Input the window height");
		double windowHeight = dan.nextDouble();
		
		System.out.println("Input the number of doors");
		double numDoors = dan.nextDouble();
		
		System.out.println("Input the door length");
		double doorlength = dan.nextDouble();
		
		System.out.println("Input the door height");
		double doorHeight = dan.nextDouble();
		
	
				
		double peakSide = (length* width + 0.5*(length*(height-width)))*2; 
		
		double normSide = (length * width)*2;
		

		double totalDoors = doorlength * doorHeight * numDoors;
		double totalWindows = windowlength * windowHeight * numWindow;
		
		double walls = (normSide)+(peakSide)-(totalWindows+totalDoors);
	
		double totalCost = walls*paintCost;
		System.out.println(walls + "sqr/ft");	
		System.out.println("The total cost is $" + totalCost);
		dan.close();
		
		
	}

}
