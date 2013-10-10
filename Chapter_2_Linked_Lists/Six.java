public class Six
{
	public static void main(String[] args)
	{
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);
		n4.setNext(n5);
		n5.setNext(n6);
		n6.setNext(n2);
		
		Node rs = find(n1);
		System.out.println("ans => "+ rs.getVal());
	}
	
	public static Node find(Node h)
	{
		Node p1 = h;
		Node p2 = h;
		
		while(true)
		{
			p1 = p1.getNext();
			p2 = p2.getNext();
			if(p1 == null || p2 == null)
				return null;
			
			p1 = p1.getNext();
			if(p1 == p2)
				break;
		}
		
		p1 = h;
		while(true)
		{
			if(p1 == p2)
				return p1;
			p1 = p1.getNext();
			p2 = p2.getNext();
		}
		
	}
}