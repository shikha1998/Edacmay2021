import java.util.*;
class Max
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("insert numbers : ");
		int max = arr[0];
		for(int i = 0; i < 5; i++)
		{
			arr[i] = sc.nextInt();
		}

		for(int k = 0; k < 5; k++)
		{
			if(arr[k] > max)
			{
				max = arr[k];
			}
		}
		System.out.println("Maximum number is " +max);
	}
}