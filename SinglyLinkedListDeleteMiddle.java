public class SinglyLinkedListDeleteMiddle
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
public static int count = 0;

public void addFirst(int data)
{	
	Node newNode = new Node(data);
	count++;
	if(headNode==null)
	{
	headNode = tailNode =  newNode;
	headNode.nextNode=null;
	return;
	}
	newNode.nextNode = headNode;
	headNode = newNode;
	
	
}
public void printAll(){
if(count == 0){
System.out.println("its empty");
return;
}
tempNode = headNode;
while(tempNode !=null)
{
	System.out.print(tempNode.data+" ");
	tempNode = tempNode.nextNode;
}
System.out.println();
}

public void deleteMiddle(int index){
	if(index > count){
		return;
	}
	tempNode = headNode;
	int nCount=2;
	while(nCount<index)
	{
		tempNode = tempNode.nextNode;
		nCount++;
	}
	Node middleNode = tempNode.nextNode;
	tempNode.nextNode = (tempNode.nextNode).nextNode;
	middleNode.nextNode=null;
	System.out.println("deleted from "+ index+"th index: "+middleNode.data);
	count--;	
}
public static void main(String[] args){
		SinglyLinkedListDeleteMiddle list = new SinglyLinkedListDeleteMiddle();
		list.addFirst(1);
		list.addFirst(2);
		list.addFirst(3);
		list.addFirst(4);
		list.addFirst(5);
		list.addFirst(6);
		list.addFirst(7);
		list.printAll();
		System.out.println(count);
		list.deleteMiddle(7);
		list.printAll();
		
}
}
