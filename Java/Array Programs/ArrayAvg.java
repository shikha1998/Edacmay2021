import java.util.*;
class ArrayAvg
{
	public static void main(String args[])
	{
		int a[] = new int[5];
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		for(int i = 0; i <=4; i++)
		{
			a[i]=sc.nextInt();
			sum = sum + a[i];
		}
		float avg = sum / 5;
		System.out.println("Average : " +avg);
	}
}