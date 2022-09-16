//Name: Ahmet Yesilbas
//Project Name: Quarters
//Date: 10/12/2021
//Project Description: Finding the amount of money made by a company by putting the money made each quarter of the year while using print, keyboard inputs, and escape sequences.
import java.util.Scanner;

public class Quarters {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		//VARIABLES
		
		String companyName;
		double Q1;
		double Q2;
		double Q3;
		double Q4;
		
		System.out.print("Input company name: ");
		companyName = keyboard.nextLine();

		
		
		
		System.out.println("Input amount made in Quarter 1 of the year:");
		Q1 = keyboard.nextDouble();
		System.out.println("Input amount made in Quarter 2 of the year:");
		Q2 = keyboard.nextDouble();
		System.out.println("Input amount made in Quarter 3 of the year:");
		Q3 = keyboard.nextDouble();
		System.out.println("Input amount made in Quarter 4 of the year:");
		Q4 = keyboard.nextDouble();

		
		
		
		
		
		double total = Q1+Q2+Q3+Q4;
		System.out.printf("%s \n=================\n\nSales for each quarter of the year as follows:\nQ1 - \t$%8.2f\nQ2 - \t$%8.2f\nQ3 - \t$%8.2f\nQ4 - \t$%8.2f\n----------------\nTotal \t$%8.2f",companyName,Q1,Q2,Q3,Q4,total);

		
		
		
		
		
	}
}
