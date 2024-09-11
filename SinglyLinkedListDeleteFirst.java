public class SinglyLinkedListDeleteFirst
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

public static int count = 0;
public Node headNode = null;
public Node tailNode = null;
public Node tempNode = null;

public void addFirst(int data)
{
	Node newNode = new Node(data);
	count++;
	if(headNode == null)
	{
	headNode = tailNode = newNode;
	newNode.nextNode = null;
	return;
	}
	newNode.nextNode = headNode;
	headNode = newNode;
	
}

public void DisplayNodes()
{
tempNode = headNode;
while(tempNode != null)
{
	System.out.print(tempNode.data+" ,");
	tempNode = tempNode.nextNode;
}

}
public  void deleteFirst()
{
if(count>0){
tempNode = headNode;
headNode = headNode.nextNode;
tempNode.nextNode = null;
System.out.println("data delted: "+ tempNode.data);
count--;
}else{
	System.out.println("invalid");
}
}
public static void main(String[] args)
{
	SinglyLinkedListDeleteFirst list = new SinglyLinkedListDeleteFirst();
	list.addFirst(1);
	list.addFirst(2);
	list.addFirst(3);
	list.addFirst(4);
	list.addFirst(5);
	list.DisplayNodes();
	list.deleteFirst();
	list.deleteFirst();
	list.deleteFirst();
	list.deleteFirst();
	list.deleteFirst();
	list.deleteFirst();
	list.DisplayNodes();
	
		

}


}
