//Write a program to enter the numbers till the user wants and at the end the program should display the largest and smallest numbers entered for 3 numbers

import java.util.Scanner;
class LargestSmallest3
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter first number :");
		int first = scanner.nextInt();
		System.out.println("enter second number :");
		int second = scanner.nextInt();
		System.out.println("enter third number :");
		int third = scanner.nextInt();
		if(first > second && first > third)
		{
			System.out.println(first+" is greater");
		}
		else if(second > first && second > third)
		{
			System.out.println(second+" is greater");
		}
		else
		{
			System.out.println(third+" is greater");
		}
	}
}