class SelectionSort
{
	void selectionSort(int arr[])
	{
		int n = arr.length;
		for(int i = 0; i<n-1; i++)
		{
			int min = i;
			for(int j = i+1; j < n; j++) // no of passes
			{
				if(arr[j] < arr[min])
				{
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}		
	}
	void print(int arr[])
	{
		int n = arr.length;
		for(int i = 0; i<n; ++i)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String args[])
	{
		SelectionSort s = new SelectionSort();
		int arr[] = {7, 5, 4, 2, 10, 22};
		System.out.print("Unsorted : ");
		for(int x : arr)
		{	
			System.out.print(x+" ");
		}
		s.selectionSort(arr);
		
		System.out.println();
		
		System.out.print("Sorted : ");
		s.print(arr);
	}
}