class A2
{
	public void m1()
	 {
	System.out.println("method 1");	 
	 }
}
class A3 extends A2
{
	
	public void m1()
	 {
	System.out.println("method 2");	 
	 }

}
class A4 extends A3
{
	public static void main(String[] args)
	{
	A3 a= new A3();
	a.m1();
	}
}