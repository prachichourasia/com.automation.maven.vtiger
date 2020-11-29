class Udemy
{
	static Udemy d ;
	static int count=1;
	private int day;
	
	private Udemy() 
	{
		System.out.println("Welcome to udemy");
		System.out.println("udemy allow u to 1 month free trial");
	         freetrial();
		System.out.println("Enjoy free trial of one month");
	}
	private void freetrial()
	{
		if(day<=30)
		{
			System.out.println("allow access");
		}
		else
		{
			System.out.println("take a proper membership");
		}
	}
	public static Udemy getUdemyInstance()
	{
		if(count==1)
		{
			d=new Udemy();
		}
		return d;
	}

}
