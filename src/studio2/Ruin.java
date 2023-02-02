package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter start amount");
		double startAmount = scanner.nextDouble();
		System.out.println("enter win limit");
		double winLimit = scanner.nextDouble();	
		System.out.println("enter win chance");
		double winChance = scanner.nextDouble();
		System.out.println("number of simulations");
		int numberSimulations = scanner.nextInt();
	
				
		for (int day =0; day<numberSimulations; day++)
		{
				
		while( (startAmount <= winLimit) && (startAmount >0))
		{
			if (Math.random() <= winChance)
			{
				startAmount++;
				
			}
			
		else 
		{
			 startAmount--;
			 
		}
	}
		if (startAmount == 0)
		
		{
			System.out.println("Ruin");
		}
		else
		{
			System.out.println("Success");
		}
	System.out.println("Day " +day);
	}
	
		
		
		
		
		
		
	}
	
}
