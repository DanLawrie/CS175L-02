package helloWorld;
import java.util.Scanner;


public class Paint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dan = new Scanner(System.in);
				
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
		
		System.out.println("Input the window length");
		double windowHeight = dan.nextDouble();
		
		double windowDimension = windowlength *windowHeight;
		
		System.out.println("Input the number of doors");
		double numDoors = dan.nextDouble();
		
		System.out.println("Input the door length");
		double doorlength = dan.nextDouble();
		
		System.out.println("Input the door height");
		double doorHeight = dan.nextDouble();
		
		double doorDimension = doorlength * doorHeight;
		
		System.out.println("Enter the cost of paint per sqr/ft");
		double paintCost = dan.nextDouble();
		
		double peakSide = length* width + (1/2)*(length*(height+width)); 
		
		double normSide = length* width;
				
		double totalDoors = doorDimension * numDoors;
		double totalWindows = windowDimension * numWindow;
		
		double walls = (normSide*2)+(peakSide*2)-totalWindows-totalDoors;
		System.out.println(walls + "sqr/ft");
		double totalCost = walls*paintCost;
				
		System.out.println("The total cost is $" + totalCost);
		dan.close();
		
		
	}

}
