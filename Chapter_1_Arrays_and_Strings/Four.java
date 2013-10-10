public class Four
{
	public static void main(String[] args)
	{
		char[] a = {'a',' ','c',' ',' '};
		char[]rs = trans(a);
		for(char c : rs)
			System.out.print(c);
	}
	
	public static char[] trans(char[] a)
	{
		int i = 0;
		for(i = a.length-1; i >= 0; i--)
		{
			if(a[i]!=' ')
				break;
		}
		
		for(int j = a.length-1; j >= 0; )
		{
			if(j <= i || i < 0)
				break;
			char curr = a[i];
			if(curr == ' ')
			{
				a[j]='0';
				j--;
				a[j]='2';
				j--;
				a[j]='%';
				j--;
			}
			else
			{
				a[j]=curr;
				j--;
			}
			i--;
		}
		
		return a;
	}
}