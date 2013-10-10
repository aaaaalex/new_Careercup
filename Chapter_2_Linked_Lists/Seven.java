public class Seven
{
	public static class Result
	{
		public Node node;
		public boolean isPalin;
		public Result(Node n, boolean isP)
		{
			node = n;
			isPalin = isP;
		}
	}
	public static void main(String[] args)
	{
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(3);
		Node n6 = new Node(2);
		Node n7 = new Node(1);
		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);
		n4.setNext(n5);
		n5.setNext(n6);
		n6.setNext(n7);
		
		if(setup(n1))
			System.out.println("Yes it is a palindrome");
		else
			System.out.println("No, it is not a palindrome");
	}
	
	public static boolean setup(Node h)
	{
		Node tmp = h;
		int len = 0;
		while(tmp != null)
		{
			len++;
			tmp = tmp.getNext();
		}
		
		Result rs = exec(h, len);
		if(rs.isPalin)
			return true;
		else
			return false;
	}
	
	public static Result exec(Node h, int len)
	{
		if(h == null || len == 0)
			return new Result(null, true);
		if(len == 2)
			return new Result(h.getNext().getNext(), h.getVal() == h.getNext().getVal());
		if(len == 1)
			return new Result(h.getNext(), true);
		Result rs = exec(h.getNext(), len-2);
		if(!rs.isPalin)
			return new Result(null, false);
		Node forNext = rs.node.getNext();
		
		return new Result(forNext, h.getVal() == rs.node.getVal());
	}
}