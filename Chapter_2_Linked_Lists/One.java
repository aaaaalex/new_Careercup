public class One
{
	public static void main(String[] args)
	{
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(4);
		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);
		n4.setNext(n5);
		
		Node t = n1;
		while(t!=null)
		{
			System.out.print(t.getVal());
			if(t.getNext() != null)
				System.out.print("->");
			t = t.getNext();
		}
		System.out.println("");
		remove(n1);
		System.out.println("============================");
		
		t = n1;
		
		while(t!=null)
		{
			System.out.print(t.getVal());
			if(t.getNext() != null)
				System.out.print("->");
			t = t.getNext();
		}
	}
	
	public static void remove(Node head)
	{
		Node t = head;
		while(t != null)
		{
			Node tn = t;
			while(tn.getNext() != null)
			{
				if(t.getVal() == tn.getNext().getVal())
				{
					tn.setNext(tn.getNext().getNext());
				}
				else
					tn = tn.getNext();
			}
			t = t.getNext();
		}
	}
}