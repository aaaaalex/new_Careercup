public class Seven
{
	//In this method, we project all those zeros to the corresponding first row and column so that no additional space will be needed
	public static void main(String[] args)
	{
		int[][] a = {{1,0,3},{4,5,0},{7,8,9}};
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
		boolean rowzero = false;
		boolean colzero = false;
		
		for(int i = 0; i < a[0].length; i++)
		{
			if(a[0][i] == 0)
			{
				rowzero = true;
				break;
			}
		}
		
		for(int i = 0; i < a.length; i++)
		{
			if(a[i][0] == 0)
			{
				colzero = true;
				break;
			}
		}
		
		for(int i = 1; i < a.length; i++)
		{
			for(int j = 1; j < a[0].length; j++)
			{
				if(a[i][j] == 0)
				{
					a[i][0] = 0;
					a[0][j] = 0;
				}
			}
		}
		
		for(int i = 0; i < a.length; i++)
		{
			if(a[i][0] == 0)
			{
				for(int j = 1; j < a[0].length; j++)
				{
					a[i][j] = 0;
				}
			}
		}
		
		for(int i = 0; i < a[0].length; i++)
		{
			if(a[0][i] == 0)
			{
				for(int j = 1; j < a.length; j++)
				{
					a[j][i] = 0;
				}
			}
		}
		
		if(rowzero)
		{
			for(int i = 0; i < a[0].length; i++)
			{
				a[0][i] = 0;
			}
		}
		if(colzero)
		{
			for(int i = 0; i < a.length; i++)
			{
				a[i][0] = 0;
			}
		}
	}
}