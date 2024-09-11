public class SinglyLinkedListReverse
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
public static int size = 0;

public void addFirst(int data)
{
	Node newNode = new Node(data);
	if(headNode == null)
	{
		headNode = tailNode = newNode;
		newNode.nextNode = null;
		return;
	}
	newNode.nextNode = headNode;
	headNode = newNode;
}

public void display()
{
tempNode = headNode;
while(tempNode != null)
{
	System.out.print(tempNode.data+" ->");
	tempNode = tempNode.nextNode;
}
System.out.println();

}

public Node FindTheMiddle()
{
Node fast = headNode;
Node slow = headNode;

while(fast!= null && fast.nextNode!=null)
{
	fast = (fast.nextNode).nextNode; 
	slow = slow.nextNode;
}
return slow;

}


public void reversing()
{
//Node middleNode = FindTheMiddle();
Node currentNode = headNode;
Node nextNode = null;
Node prev = null;

while(currentNode!=null)
{nextNode = currentNode.nextNode;
currentNode.nextNode = prev;
prev = currentNode;
currentNode = nextNode;
}
tailNode=headNode;
headNode = prev;
}

public static void main(String[] args)
{
	SinglyLinkedListReverse list = new SinglyLinkedListReverse();
	list.addFirst(1);
	list.addFirst(2);
	list.addFirst(3);
	list.addFirst(4);
	list.addFirst(5);
	list.addFirst(6);
	list.addFirst(7);
	list.addFirst(8);
	list.addFirst(9);
	list.addFirst(10);
	list.display();
	list.reversing();
	list.display();
}
}
