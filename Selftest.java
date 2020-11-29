
class Selftest
{	
	 int x=14;
	static int  y=18;
	public static void main(String[] args) 
	{
	Selftest t=new Selftest(); 
	System.out.println(t.x);
	t.x=20;
	System.out.println(t.x);
	Selftest t1=new Selftest(); 
	System.out.println(t1.x);
	}

}
class SNflow 
{  
	public static void main(String[] args) 
	{
		Selftest f= new Selftest();
		System.out.println(f.x);
		System.out.println(Selftest.y);
	}
 
}