class A 
{
	A(int x)
	{
		System.out.println("a is running");
	}
}

public class Trial extends A
{
		public Trial()
		{
			System.out.println("trial is running");
		}
		public static void main(String[] args)
		{
			System.out.println("main running");
			new Trial();
		}
		
}
