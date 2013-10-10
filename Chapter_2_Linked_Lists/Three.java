public class Three
{
	public static void main(String[] args)
	{
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);
		n4.setNext(n5);
		
		delete(n3);
		
		Node t = n1;
		
		while(t!=null)
		{
			System.out.print(t.getVal());
			if(t.getNext() != null)
				System.out.print("->");
			t = t.getNext();
		}
		
	}	
	
	public static void delete(Node h)
	{
		Node t = h;
		
		while(t != null)
		{
			t.setVal(t.getNext().getVal());
			if(t.getNext().getNext() != null)
				t=t.getNext();
			else
			{
				t.setNext(null);
				break;
			}
		}
	}
}