 class A1
 {

	 A1()
	{
		System.out.println("demotest");
	}

}
class A extends A1
{
	A(int x)
	{
		System.out.println("class a");
	}
	public static void main(String[] args)
	{
		A a=new A(5);
	}
	}