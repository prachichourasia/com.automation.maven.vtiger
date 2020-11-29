Class Prime
{
	public static void main(String[] args)
	{
		System.out.println("1");
		int num=17, i,j,k=0;
		num1=num;
		for(i=2;i<=num;i++)
		{
			boolean b=true;
		for(j=2;j<=i;j++)
		{
			
			if(i%j==0)
			{
				b=false;
				break;
			}
		}
			if(b==true)
			{
				SOP(i);
			}
			if(i>k)
			{
				k=i;
			}
		}
			SOP("Highest No. is " + k);	
}}	
			