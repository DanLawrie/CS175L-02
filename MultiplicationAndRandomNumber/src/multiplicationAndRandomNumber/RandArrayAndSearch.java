package multiplicationAndRandomNumber;

import java.util.Random;

public class RandArrayAndSearch {

	public static void main(String[] args) {
		int largest = 0;
		int smallest = 30;
		int mostCommon=0;
		int comNum = 0;
		int common = 0;
		
		
		Random generator = new Random();
		
		int[] array = new int[50];
		
		for(int i = 0; i <= array.length-1; i++)
		{
			array[i] = 1 + generator.nextInt(25);
			System.out.print(array[i]+ " ");
			if(array[i]> largest)
			{
				largest = array[i];
			}
			if(array[i]< smallest)
			{
				smallest = array[i];
			}
			//extra credit
			common=0;
			for(int j = 0; j <= array.length-1; j++)
			{
				if (array[i] ==array[j])
				{
					common++;
				}
			}
			if(common> mostCommon)
			{
				mostCommon = common;
				comNum = array[i];
			}
				
		}
		
		
		
		System.out.println("\nLargest: " + largest);
		System.out.println("Smallest: " + smallest);
		System.out.println("Product: " + (smallest * largest));
		System.out.println("Most common number: " + comNum + "\nIt appears: " + mostCommon);
	}

}
