public class SinglyLinkedListRecursiveSearch
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
public Node headNode= null;
public Node tailNode = null;
public Node tempNode = null;
public static int count;

public void addFirst(int data)
{
	Node newNode = new Node(data);
	newNode.nextNode = null;
	count++;
	if(headNode == null)
	{
	headNode = tailNode = newNode;
	return;
	}
	newNode.nextNode=headNode;
	headNode=newNode;
}
public int helperFunction(Node headNode,int key)
{
	if(headNode == null)
	{
		return -1; 
	}
	if(headNode.data == key)
	{
		return 0;
	}
	int index = helperFunction(headNode.nextNode,key);
	if(index == -1)
	{
		return index;
	}
	return index+1; 
}
public int recursiveSearch(int  key)
{
	return helperFunction(headNode,key);
}

  
    public void Display()
    {
         
        tempNode = headNode;
        while (tempNode != null)
        {
            System.out.print(tempNode.data+ " -> ");
            tempNode=tempNode.nextNode;
        }
        System.out.println("null");
    }
    
    public static void main(String[] args)
    {
    	SinglyLinkedListRecursiveSearch list = new SinglyLinkedListRecursiveSearch();
    	list.addFirst(1);
    	list.addFirst(2);
    	list.addFirst(3);
    	list.addFirst(4);
    	list.addFirst(5);
    	list.addFirst(6);
    	list.addFirst(7);
    	list.Display();
    	System.out.println(list.recursiveSearch(4));
    }
    
    

}
