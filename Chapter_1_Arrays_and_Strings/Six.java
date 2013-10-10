public class Six
{
	public static void main(String[] args)
	{
		int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("Before");
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a.length; j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println("");
		}
		trans(a);
		System.out.println("=============================================");
		System.out.println("After");
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a.length; j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println("");
		}
	}
	
	public static void trans(int[][] a)
	{
		int l = a.length;
		int c = 0;
		if(l <= 1)
			return;
		if(l%2 == 0)
			c = (l/2);
		else
			c = (l+1)/2;
		for(int i = 0; i < c; i++)
		{
			for(int j = i; j < l-i-1; j++)
			{
				int tmp = a[i][j];
				a[i][j] = a[l-j-1][i];
				a[l-j-1][i] = a[l-i-1][l-j-1];
				a[l-i-1][l-j-1] = a[j][l-i-1];
				a[j][l-i-1] = tmp;
			}
		}
	}
}