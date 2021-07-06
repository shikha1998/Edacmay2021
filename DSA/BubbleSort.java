class BubbleSort
{
	void bubbleSort(int arr[])
	{
		int n = arr.length;
		for(int i = 0; i<n-1; i++)
		{
			for(int j = 0; j<(n-1-i); j++) // no of passes
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	void print(int arr[])
	{
		int n = arr.length;
		for(int i = 0; i<n; ++i)
		{
			//System.out.print(Arrays.toString(arr));
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String args[])
	{
		BubbleSort b = new BubbleSort();
		int arr[] = {5, 3, 8, 4, 6};
		System.out.print("Unsorted : ");
		for(int x : arr)
		{	
			System.out.print(x+" ");
		}
		b.bubbleSort(arr);
		
		System.out.println();
		
		System.out.print("Sorted : ");
		b.print(arr);
	}
}