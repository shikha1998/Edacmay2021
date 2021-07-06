class Node4
{
	int data;
	Node4 next;
	Node4(int d)
	{
		data = d;
	}
}
class LinkListInsertion
{
	Node4 head;
	
	// insertion at begining
	void insertBeg(int new_data)
	{
		Node4 new_node = new Node4(new_data);
		if(head == null)
		{
			head = new_node;
		}
		else
		{
			new_node.next = head;
			head = new_node;
		}
	}
	//insertion at end
	public void insertEnd(int new_data)
	{
		Node4 new_node = new Node4(new_data);
		if(head == null)
		{
			head =  new_node;
		}
		else
		{
			Node4 temp = head;
			while(temp.next != null)
			{
				temp = temp.next; // for traversing
			}
			temp.next = new_node; // to link 
		}
	}
	void insertMid(int new_data)
	{
		Node4 new_node = new Node4(new_data);
		Node4 temp = head;
		if( temp != null)
		{
				new_node.next=temp.next ;
				temp.next=new_node ;
		}
	}
	// displaying
	public void display()
	{
		Node4 temp = head;
		while(temp != null)
		{
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	public static void main(String args[])
	{
		LinkListInsertion l = new LinkListInsertion();
		l.insertBeg(10);
		l.insertBeg(20);
		l.insertBeg(30);
		l.insertBeg(40);
        
		l.insertEnd(55);
		//l.display();
		
		l.insertMid(100);
		l.insertMid(111);
		l.display();
	}
}
