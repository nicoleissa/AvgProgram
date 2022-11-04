/* Average.java: Reads n numbers and prints their average using loops  

Name: Nicole Issagholian

Date: 9/27/2021
*/

import java.util.Scanner;

public class Average
{
	public static void main(String[] args)
	{
		//creates a Scanner object
		Scanner data = new Scanner(System.in);


		//initializes and declares variable for the value of each number
		double valueOfNum = 0;
		
		//initializes and declares variable for the sum of the numbers
		double sum = 0;


		//asks the user to input how many numbers there are
		System.out.println("How many numbers: ");

		System.out.print("> ");

		//reads user input for number of numbers 
		int numOfNums = data.nextInt();


		//asks the user to input the numbers
		System.out.println("Insert " + numOfNums + " numbers: ");


		//counter-controlled loop that adds up all the values of each number 
		for (int i=0; i < numOfNums; i++)
		{
			System.out.print("> ");
			valueOfNum = data.nextDouble();
			sum += valueOfNum;
		}	
		

		//compute average
		double avg = sum/numOfNums;	

		//prints average
		System.out.println("\nTheir average is " + String.format("%.1f", avg)); 
	}
}

