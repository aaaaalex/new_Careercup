public class Two
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
		
		Node rs = find(3, n1);
		System.out.println("rs => "+rs.getVal());
	}
	
	public static Node find(int k, Node head)
	{
		Node p1 = head;
		Node p2 = head;
		
		for(int i = k-1; i > 0; i--)
		{
			p1 = p1.getNext();
		}
		
		while(p1.getNext()!=null)
		{
			p1 = p1.getNext();
			p2 = p2.getNext();
		}
		return p2;
	}
}