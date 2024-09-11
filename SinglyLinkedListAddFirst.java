public class SinglyLinkedListAddFirst
{
public static class Node
{
	public  int data;
	public Node nextNode;

	public Node(int data)
	{
	this.data = data;
	}
}

public Node headNode=null;
public Node tailNode=null;
public Node tempNode=null;

public void AddFirst(int data)
{
	Node newNode = new Node(data);
	if(headNode==null)
	{
		headNode = tailNode = newNode;
		newNode.nextNode = null;
		return;
	}
	newNode.nextNode=headNode;
	headNode = newNode;
}

public void PrintTheLinkedList()
{
	Node Temp = headNode;
	while(Temp!=null)
	{
		System.out.print(Temp.data+" , ");
		Temp = Temp.nextNode;
	}
}

public static void main(String[] args)
{
	SinglyLinkedListAddFirst Slist = new SinglyLinkedListAddFirst();
	
	Slist.AddFirst(1);
	Slist.AddFirst(2);
	Slist.AddFirst(3);
	Slist.AddFirst(4);
	Slist.AddFirst(5);
	Slist.PrintTheLinkedList();
	
		

}

	
}

