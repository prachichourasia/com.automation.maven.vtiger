class PSM1
{
  public static void m1()
	{
	System.out.println(" class1 method1 ");
	}
}
class PSM2 extends PSM1
{
  public static void m1()
	{
	System.out.println("class2 method 1 ");
	}
}
class PSM3 extends PSM2
{
  public  static void m1()
	{
	System.out.println("class3 method 1");
	}
}
class PolyStaticMethod4
{
  public static void main(String[] arg)
	{
	PSM1 p= new PSM3();
	p.m1();
	
	PSM1 q= new PSM2();
	q.m1();
	
	PSM2 r= new PSM3();
	r.m1();
	
	}
}