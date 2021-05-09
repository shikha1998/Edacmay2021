import java.util.*;
class Fifteen
{
	public static void main(String args[])
	{
		int a,b,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value of a and b : ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Before swapping : "+a+" " +b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("After swapping : "+a+ " "+b);
		System.out.println();
	}
}