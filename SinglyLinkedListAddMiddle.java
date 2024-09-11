public class SinglyLinkedListAddMiddle{

public static class Node{
public int data;
public Node nextNode;
public Node(int data)
{
	this.data = data;
}
}
public static int count=0;
public Node headNode = null;
public Node tailNode = null;
public Node tempNode = null;
public void addFirst(int data)
{
	Node newNode = new Node(data);
	count++;
	if(headNode == null)
	{
		headNode = newNode;
		tailNode = newNode;
		newNode.nextNode =null;	
		return;
	}
	newNode.nextNode  = headNode;
	headNode=newNode; 
}

public void printList()
{
tempNode = headNode;
	while(tempNode != null)
	{
		System.out.print(tempNode.data+" ,");
		tempNode = tempNode.nextNode;
	}
	System.out.println();
}

public void addInTheMiddle(int data , int index)
{
	if(index<=count && index!=0)
	{
	int pos = 2;
	tempNode = headNode;
	Node newNode;
	newNode = new Node(data);
	newNode.nextNode = null;
	
		
	 	if(index==1){
	 	newNode.nextNode = headNode;
	 	headNode = newNode;
	 	count++;
	 	return;
	 	}
	 	  if(index==count){
	 	tailNode.nextNode = newNode;
	 	tailNode = newNode;
	 	newNode.nextNode = null;
	 	count++;
	 	return;
	 	}
	 	while(pos<index){
	 	 
	 	
	 		tempNode = tempNode.nextNode;
	 		pos++;
	 	}
	 	newNode.nextNode = tempNode.nextNode;
	 	tempNode.nextNode = newNode;
	 	count++;
	 	
	 	
	}else{
	System.out.println("invalid");
	}

} 

public static void main(String[] args)
{
	SinglyLinkedListAddMiddle sList = new SinglyLinkedListAddMiddle();
	sList.addFirst(1);
	sList.addFirst(2);
	sList.addFirst(3);
	sList.addFirst(4);
	sList.addFirst(5);
	sList.printList();
	sList.addInTheMiddle(12,3);
	sList.printList();
	sList.addInTheMiddle(1111,2);
	sList.printList();
	sList.addInTheMiddle(12111,1);
	sList.printList();
	sList.addInTheMiddle(120000,count);
	sList.printList();
	System.out.println(count);
}

}
