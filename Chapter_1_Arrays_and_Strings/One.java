public class One
{
	public static void main(String[] args)
	{
		String a = "abcedfa";
		if(check(a))
			System.out.println("This is a sentence with uniq characters");
		else
			System.out.println("This sentence contains duplicates");
	}
	
	public static boolean check(String a)
	{
		int res = 0;
		for(int i = 0; i < a.length(); i++)
		{
			int t = (int)a.charAt(i);
			if((res & (1 << t)) > 0)
				return false;
			res += 1<<t;
		}
		return true;
	}
}