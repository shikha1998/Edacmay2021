import java.util.*;
class DuplicateNum
{
	public static void main(String args[])
	{
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("insert numbers : ");
		for(int k = 0; k < 5; k++)
		{
			arr[k] = sc.nextInt();
		}
		for(int i =0; i < 5; i++)
		{ 
			for(int j = i + 1; j < 5; j++)
			{
				if(arr[i] == arr[j])
				{
					System.out.println("Duplicate number is "+arr[j]);
				}
			}
		}
	}
}