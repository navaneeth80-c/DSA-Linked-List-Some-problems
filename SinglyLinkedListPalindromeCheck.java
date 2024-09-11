public class SinglyLinkedListPalindromeCheck
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
public void addLast(int data)
   {
       Node newNode = new Node(data);
       size++;
       if(headNode==null)
       {
           headNode=tailNode=newNode;
           newNode.nextNode=null;
           return;
       }
       tailNode.nextNode=newNode;
       tailNode=newNode;
       tailNode.nextNode=null;
   }
   
    public void display()
   {
       tempNode=headNode;
       while (tempNode != null)
       {
           System.out.print(tempNode.data+" ->");
           tempNode=tempNode.nextNode;
       }
       System.out.println("null");


   } 
   public Node middleNodeFinder()
   {
   	Node fast = headNode;
   	Node slow = headNode;
   	
   	while(fast!=null && fast.nextNode!=null)
   	{
   	fast = (fast.nextNode).nextNode;
   	slow = slow.nextNode;
   	}
   	return slow;
   }
   
   
   public boolean isItPalindrome()
   {
   	Node middleNode = middleNodeFinder();
   	Node prev = null;
   	Node nextNode = null;
   	Node currentNode = middleNode;
   	
   	while(currentNode != null)
   	{
   	nextNode = currentNode.nextNode;
   	currentNode.nextNode = prev;
   	prev = currentNode;
   	currentNode = nextNode;
   	}
   	
   	Node newHead = prev;
   	tempNode = headNode;
   	
   	while(newHead != middleNode)
   	{
   	if( tempNode.data != newHead.data)
   	{
   		return false;
   	}
   	newHead = newHead.nextNode;
   	tempNode = tempNode.nextNode;
   	}
   	return true; 
   
   }
   
   public static void main(String[] args)
   {
   SinglyLinkedListPalindromeCheck list = new SinglyLinkedListPalindromeCheck();
   
   list.addLast(1);
     list.addLast(1);
       list.addLast(1);
         list.addLast(1);
           list.addLast(1);
             list.addLast(2);
               list.addLast(1);
           //    System.out.println(list.Size);
               list.display();
   	System.out.println(list.isItPalindrome());
   }
   }
