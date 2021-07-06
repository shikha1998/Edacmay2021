class InsertionSort
{
	void insertionSort(int arr[])
	{
		int index;
		int n = arr.length;
		for(int i = 1; i < n; i++)
		{
			int temp = arr[i];
			index = i;
			while(index > 0 && arr[index - 1] > temp)
			{
				arr[index] = arr[index - 1];
				index--;
			}
			arr[index] = temp;
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
		InsertionSort s = new InsertionSort();
		int arr[] = {7, 5, 4, 2, 10, 22};
		System.out.print("Unsorted : ");
		for(int x : arr)
		{	
			System.out.print(x+" ");
		}
		s.insertionSort(arr);
		
		System.out.println();
		
		System.out.print("Sorted : ");
		s.print(arr);
	}
}