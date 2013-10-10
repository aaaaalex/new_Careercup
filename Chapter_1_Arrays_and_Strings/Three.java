public class Three
{
	public static void main(String[] args)
	{
		String a = "@abcdd";
		String b = "b@adct";
		if(check(a, b))
			System.out.println("Yes, b is permutation of a");
		else
			System.out.println("No, b is not permutation of b");
	}
	
	public static boolean check(String a, String b)
	{
		//We assume that the ASCII is used for characters
		if(a.length() != b.length())
			return false;
		
		int[] records = new int[256];
		for(int i = 0; i < a.length(); i++)
		{
			records[(int)a.charAt(i)]++;
		}
		
		for(int i = 0; i < b.length(); i++)
		{
			records[(int)b.charAt(i)]--;
			if(records[(int)b.charAt(i)] < 0)
				return false;
		}
		return true;
	}	
}