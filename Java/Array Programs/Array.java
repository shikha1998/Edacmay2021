import java.util.*;
class Array
{
	public static void main(String args[])
	{
		int a1[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		for(int i = 0; i <=4; i++)
		{
			a1[i]=sc.nextInt();
		}
		for(int i = 0; i <=4; i++)
		{
			System.out.print(a1[i]+ " ");
		}
	}
}
