import java.util.*;
class Stack
 {
	int size;
	int top = -1;
	char arr[];
	Stack(int s)
	{
		size = s;
		arr = new char[size];
	}
	void push(char data)
	{
		if(top == size - 1)
		{
			System.out.println("Overflow");
		}
		arr[++top] = data;
	}
	char pop()
	{
		if(top == -1)
		{
			System.out.println("Underflow");
		}
		char temp = arr[top];
		top--;
		return temp;
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
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i]+" ");
	}
 }
 class StackReverse
 {
	public static void main(String args[]) 
	{
		Stack s = new Stack(6);
		String str = "shikha";
		int len = str.length();
		for(int i = 0; i<len; i++)
		{
			s.push(str.charAt(i));
		}
		
		for(int i = s.top; i>=0; i--)
		{
			System.out.print(s.pop()+" ");
		}
	}
}