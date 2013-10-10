public class Five
{
	public static void main(String[] args)
	{
		Node n1 = new Node(7);
		Node n2 = new Node(1);
		Node n3 = new Node(6);
		Node n4 = new Node(5);
		Node n5 = new Node(9);
		Node n6 = new Node(3);
		n1.setNext(n2);
		n2.setNext(n3);
		n4.setNext(n5);
		n5.setNext(n6);
		
		Node rshead = summup1(n1, n4);
		Node t = rshead;
		System.out.println("BACKWARD ORDER");
		while(t!=null)
		{
			System.out.print(t.getVal());
			if(t.getNext() != null)
				System.out.print("->");
			t = t.getNext();
		}
		System.out.println("\n==================================");
		System.out.println("FORWARD ORDER");
		rshead = summup2(n1, n4);
		t = rshead;
		while(t!=null)
		{
			System.out.print(t.getVal());
			if(t.getNext() != null)
				System.out.print("->");
			t = t.getNext();
		}
	}
	
	public static Node summup1(Node h1, Node h2)
	{
		//This method handles input in the backward order list
		//For example: 2->1->9 is 912
		int res = 0;
		int c = 10;
		int pre = 0;
		Node currNode = null;
		Node rshead = null;
		while(h1 != null || h2 != null)
		{
			int tmpsum = 0;
			if(h1 != null && h2 != null)
			{
				tmpsum = h1.getVal() + h2.getVal() + pre;
				h1 = h1.getNext();
				h2 = h2.getNext();		
			}
				
			
			else if(h1 != null)
			{
				tmpsum = h1.getVal() + pre;
				h1 = h1.getNext();
			}
			else
			{
				tmpsum = h2.getVal() + pre;
				h2 = h2.getNext();
			}
			
			if(tmpsum > c)
			{
				pre = 1;
				tmpsum -= c;
			}
			else
				pre = 0;
					
			Node tmp = new Node(tmpsum);
			//c *= 10;
			
			if(currNode == null)
			{
				currNode = tmp;
				rshead = currNode;
			}
			else
			{
				currNode.setNext(tmp);
				currNode = currNode.getNext();
			}
		}
		if(currNode.getVal() >= 10)
		{
			currNode.setVal(currNode.getVal() - 10);
			Node n = new Node(1);
			currNode.setNext(n);
		}
		
		return rshead;
	}
	
	
	
	public static Node summup2(Node h1, Node h2)
	{
		/*This method handles the forward order list
		 *The challenge is that if these two given list are different 
		 *lenght, then we cannot directly find each pair of nodes to sum up.
		 *One choice is to traverse both lists first and get difference between their length, so that we could match up each correct pair of nodes to sum up
		 */
		 
		 int l1 = 0;
		 int l2 = 0;
		 Node t1 = h1;
		 Node t2 = h2;
		
		while(t1 != null || t2 != null)
		{
			if(t1 != null)
			{
				l1++;
				t1 = t1.getNext();
			}
			
			if(t2 != null)
			{
				l2++;
				t2 = t2.getNext();
			}
		}
		
		int dif = l1 - l2;
		Node rs = up2exec(h1, h2, dif);
		if(rs.getVal() > 10)
		{
			rs.setVal(rs.getVal()-10);
			Node rrs = new Node(1);
			rrs.setNext(rs);
			return rrs;
		}
		return rs;
	}
	
	public static Node up2exec(Node h1, Node h2, int dif)
	{
		
		if(dif == 0)
		{
			if(h1.getNext() == null && h2.getNext() == null)
				return new Node(h1.getVal()+h2.getVal());
			Node rs = up2exec(h1.getNext(), h2.getNext(), dif);
			int tmpsum = h1.getVal() + h2.getVal();
			if(rs.getVal() >= 10)
			{
				rs.setVal(rs.getVal()-10);
				tmpsum++;
			}
			Node curr = new Node(tmpsum);
			curr.setNext(rs);
			return curr;
		}
		if(dif > 0)
		{
			Node rs = up2exec(h1.getNext(), h2, --dif);
			int tmpsum = h1.getVal();
			if(rs.getVal() >= 10)
			{
				rs.setVal(rs.getVal()-10);
				tmpsum++;
			}
			Node curr = new Node(tmpsum);
			curr.setNext(rs);
			return curr;
		}
		else
		{
			Node rs = up2exec(h1, h2.getNext(), ++dif);
			int tmpsum = h2.getVal();
			if(rs.getVal() >= 10)
			{
				rs.setVal(rs.getVal()-10);
				tmpsum++;
			}
			Node curr = new Node(tmpsum);
			curr.setNext(rs);
			return curr;
		}
	}
}