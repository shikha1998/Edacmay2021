import java.util.*;
class Twelve
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int a = sc.nextInt();
		System.out.println("Enter second number : ");
		int b = sc.nextInt();
		System.out.println("Enter third number : ");
		int c = sc.nextInt();
		float avg = (a + b + c)/3;
		System.out.println("Average is "+avg);
	}
}