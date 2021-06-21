
//Write a program to enter the numbers till the user wants and at the end the program should display the largest and smallest numbers entered.



import java.util.Scanner;
class LargestSmallest2
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter first number :");
		int first = scanner.nextInt();
		System.out.println("enter second number :");
		int second = scanner.nextInt();
		if(first > second)
		{
			System.out.println("Larger is " +first);
		}
		else
		{
			System.out.println("Smallest is " +second);
		}
	}
}