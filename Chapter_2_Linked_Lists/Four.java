public class Four
{
	public static void main(String[] args)
	{
		Node n1 = new Node(99);
		Node n2 = new Node(2);
		Node n3 = new Node(103);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);
		n4.setNext(n5);
		
		split(110, n1);
		
		Node t = n1;
		
		while(t!=null)
		{
			System.out.print(t.getVal());
			if(t.getNext() != null)
				System.out.print("->");
			t = t.getNext();
		}
	}
	
	public static void split(int v, Node h)
	{
		Node p = h;
		Node curr = h;
		
		while(curr != null)
		{
			if(curr.getVal() < v)
			{
				int tmp = p.getVal();
				p.setVal(curr.getVal());
				curr.setVal(tmp);
				p=p.getNext();
			}
			
			curr = curr.getNext();
		}
	}
}