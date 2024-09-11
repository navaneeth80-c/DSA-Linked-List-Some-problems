public class SinglyLinkedListDeleteLast
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
public Node tempNode = null;
public Node tailNode = null;
public static int count = 0;
public void addLast(int data)
{
Node newNode= new Node(data);
count++;
if(headNode == null)
{
headNode = tailNode = newNode;
newNode.nextNode = null;
return;
}
tailNode.nextNode = newNode;
tailNode = newNode;
tailNode.nextNode = null;
}

public void displayNode()
{
if(count>0){
tempNode = headNode;
while(tempNode != null)
{
	System.out.print(" "+tempNode.data);
	tempNode=tempNode.nextNode;
}
System.out.println();
}else{
System.out.println("empty");
}
}

public void deleteLast()
{
if(count ==1){
System.out.println("last node data deleted"+headNode.data);
count--;
headNode=null;
tailNode=null;
}
if(count>1){
tempNode = headNode;

while(tempNode.nextNode != tailNode){
	tempNode = tempNode.nextNode;
}
tempNode.nextNode = null;
System.out.println(tailNode.data+" is deleted");
count--;
System.out.println("count: "+count);
tailNode = null;
tailNode = tempNode;
}else{
System.out.println("invalid");
}
}

public static void main(String[] args)
{
	SinglyLinkedListDeleteLast list = new SinglyLinkedListDeleteLast();
	list.addLast(0);
	System.out.println(count);
	list.addLast(1);
	System.out.println(count);
	list.addLast(2);
	System.out.println(count);
	list.addLast(3);
	System.out.println(count);
	list.addLast(4);
	System.out.println(count);
	list.displayNode();
	list.deleteLast();
	list.deleteLast();
	list.deleteLast();
	list.deleteLast();
	list.deleteLast();
	list.deleteLast();
	list.deleteLast();
	list.displayNode();
}
}


























