import java.util.*;

public class Five
{
	public static void main(String[] args)
	{
		String a = "aaaaabbcccccaaat";
		String rs = trans(a);
		System.out.println(rs);
	}
	
	public static String trans(String a)
	{
		StringBuffer s = new StringBuffer();
		for(int i = 0; i < a.length(); i++)
		{
			int c = 1;
			char curr = a.charAt(i);
			while(i+1 < a.length() && (curr == a.charAt(i+1)))
			{
				c++;
				i++;
			}
			s.append(curr);
			s.append(c);

		}
		
		return s.toString();
	}
	
}