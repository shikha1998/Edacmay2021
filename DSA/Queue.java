
class Queue
{
	int front, rear, size;
	int arr[];
	Queue(int size)
	{
		front = 0;
		rear = -1;
		arr = new int[size];
		this.size = size;
	}
	boolean isEmpty()
	{
		if( rear == -1)
			return true;
		return false;
	}
	boolean isFull()
	{
		if(rear == (size - 1))
			return true;
		return false;
	}
	void enqueue(int element)
	{
		if(isFull())
		{
			System.out.println("Queue is full");
		}
		else
		{
			rear++;
			arr[rear] = element;
			System.out.println("Inserted : "+element);
		}
	}
	void dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty");
		}
		else
		{
			System.out.println("Deleted : "+arr[front]);
			front = front + 1;
		}
	}
	public static void main(String args[])
	{
		Queue q = new Queue(5);
		for(int i = 1; i < 6; i++)
			q.enqueue(i);
		q.enqueue(6);
		
		q.dequeue();
		q.dequeue();
		
		q.enqueue(7);
		q.enqueue(8);
	}
}