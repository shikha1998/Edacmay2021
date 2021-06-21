import java.util.*;
class FirstSecondEle
{
	public static void main(String args[])
	{
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert numbers : ");
		for(int i = 0; i<5; i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("First element is " +a[0]);
		System.out.println("Second element is " +a[1]);
	}
}