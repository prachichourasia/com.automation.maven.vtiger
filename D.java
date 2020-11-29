class D
   
	
{       static int p=100;
	static int q=200;
	int x=10;
	int y=20;

	static
	{
	System.out.println("StaticBR1");
	System.out.println("value of p is"+p);
	p=1000;
	System.out.println("value of p is "+p);
	//System.out.println("value of r is "+r);
       
	}
	{
		System.out.println("NSBR1");
		m1();
		System.out.println(x+y);
		x=15;
	//System.out.println("value of a is "+a);
	}
	public static void sm1()
	{
         System.out.println("static method running");
	q=2000;
	System.out.println("value of q is "+q);
	p=10000;
	System.out.println("value of p is "+p);
	System.out.println("value of r is "+r);
	
	}
	public void m1()
	{

		System.out.println("m1 running");
		System.out.println(a);
		System.out.println(b);
		System.out.println(a+b+x+y);
		System.out.println("value of a is "+a);
	}
	public D()
	{
		System.out.println("constructor");
		x=a;
		y=b;
	}
	{
		System.out.println("nsbr2");
		System.out.println(y+x);
		x=y=24;
		m2();
	}
	public void m2()
	{

		System.out.println("m2 running");
		System.out.println(a+b);
		System.out.println(a+b+x+y);
	}
 public static void main(String[] args) {
	System.out.println("main running");
	sm1();
	D d1= new D();
	d1.m1();
	d1.m2();
	D d2= new D();
}
 int a=25;
 static int r=300;
 static int s=400;
 int b=5;
}
