public class SinglyLinkedListAddLast
{

public static class Node
{
public int data;
public Node nextNode;
public Node(int data)
{
this.data = data;
}
}

public Node headNode = null;
public Node tailNode = null;
public Node tempNode = null;

public void addLast(int data)
{
	Node newNode = new Node(data);
		
	if(headNode==null)
	{
		headNode = tailNode = newNode;
		newNode.nextNode = null;
		return;	
	}
	
	 tailNode.nextNode = newNode;
	 newNode.nextNode=null;
	tailNode = newNode;
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
	SinglyLinkedListAddLast Slist = new SinglyLinkedListAddLast();
	Slist.addLast(1);
	Slist.addLast(2);
	Slist.addLast(3);
	Slist.addLast(4);
	Slist.addLast(5);
	Slist.PrintTheLinkedList();

}
}
