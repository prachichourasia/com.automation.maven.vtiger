public class Test
{
	 
	static
	{  
		System.out.println("TEST sbr");
	}

	{  
		System.out.println(" TEST nsbr");
	}
	
}
class Demo extends Test
{
	static
	{  
		System.out.println("DEMO sbr");
	}

	{  
		System.out.println("DEMO nsbr");
	}
	public static void main(String[] args) 
	{	
		Demo d=new Demo();
		System.out.println("main method");
		//d.m1();
	}

}
