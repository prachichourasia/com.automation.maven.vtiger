 class A3
 {
	  public void m1()
	  {
		  System.out.println("m1");
	  }
	  public void m2()
	  {
		  System.out.println("m2");
	  }
	
}
 
 class A11 extends A3
 {
	 	
	 public void m1()
	  {
		  System.out.println("m11");
	  }
	  public void m2()
	  {
		  System.out.println("m22");
	  }
	  public void m3()
	  {
		  System.out.println("m33");
	  }
	  public static void main(String[] args) 
		{
			A3 a = new A11();
			a.m1();
			a.m2();
			a.m3();
}		}