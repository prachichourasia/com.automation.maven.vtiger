class Try {

	public static void main(String[] args) 
	{
		System.out.println(m1());
	}
	
	public static int m1()
	{
		int x=10;
		int y=1;
		int z=0;
		
		try {
			z=x/y;
		}

		catch(ArithmeticException ex)
		{
			System.out.println("exception handeled");
		}
		try {} 
		catch(NullPointerException n)
		{ System.out.println();}
		return z;
	}	
}