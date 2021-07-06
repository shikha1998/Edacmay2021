class StackMain
 {
	int top = -1;
	int size;
	int arr[];
	StackMain(int s)
	{
		size = s;
		arr = new int[size];
	}
	void push(int element)
	{
		if(top == size - 1)
		{
			System.out.println("Overflow");
		}
		top++;
		arr[top] = element;
	}
	int pop()
	{
		if(top == -1)
		{
			System.out.println("Underflow");
		}
		int temp = arr[top];
		top--;
		return temp;
	}
	int peek()
	{
		if(top == -1)
		{
			System.out.println("Underflow");
		}
		return arr[top];
	}
	boolean isEmpty()
	{
		return top == -1;
	}
	boolean isFull()
	{
		return top == size - 1;
	}
	void display()
	{
		for(int i = 0; i < size; i++)
			System.out.print(" "+arr[i]);
	}
 }
 class Stack1
 {
	public static void main(String args[]) 
	{
		StackMain s = new StackMain(5);
	
		System.out.print("Push : ");
		s.push(10);
		s.push(20);
		s.push(30);
		s.display();
		System.out.println();
		System.out.println("----------------------");
		
		System.out.print("Pop : ");
		System.out.print(s.pop());
		System.out.println();
		System.out.println("----------------------");
		
		System.out.print("Push : ");
		s.push(40);
		s.push(50);
		s.push(60);
		s.display();
		System.out.println();
		System.out.println("----------------------");
		
		System.out.print("Pop : ");
		System.out.print(s.pop());
		System.out.println();
		System.out.println("----------------------");
		
		System.out.print("Push : ");
		s.push(70);
		s.display();
		System.out.println();
		System.out.println("----------------------");
	}
}