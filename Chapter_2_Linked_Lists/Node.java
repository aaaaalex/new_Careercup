public class Node
{
	private Node next;
	private int val;
	
	public Node(int a)
	{
		val = a;
	}
	
	public void setNext (Node a)
	{
		next = a;
	}
	
	public Node getNext ()
	{
		return next;
	}
	
	public int getVal()
	{
		return val;
	}
	
	public void setVal(int a)
	{
		val = a;
	}
}