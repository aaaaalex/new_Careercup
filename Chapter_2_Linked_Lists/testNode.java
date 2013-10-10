public class testNode
{
	public static void main(String[] args)
	{
		Node a = new Node(1);
		Node b = a;
		Node c = b;
		System.out.println("Original");
		System.out.println("a=>"+a.getVal());
		System.out.println("b=>"+b.getVal());
		System.out.println("c=>"+c.getVal());
		int v = 999;
		a.setVal(v++);
		System.out.println("changed");
		System.out.println("==================");
		System.out.println("New");
		System.out.println("a=>"+a.getVal());
		System.out.println("b=>"+b.getVal());
		System.out.println("c=>"+c.getVal());
		
		
	}
}