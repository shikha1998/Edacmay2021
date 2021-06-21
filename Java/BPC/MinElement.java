import java.util.*;
class MinElement
{
	public static void main(String args[])
	{
		int arr[] = new int[]{1,2,3,4,5};
		int min = arr[0];
		for(int i = 0; i <arr.length; i++)
		{
			//arr[i] = sc.nextInt();
			if(arr[i] < min)
			{
				min = arr[i];
			}
		}
		System.out.println("Smallest is " +min);
	}
}