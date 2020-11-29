public class Method3
{
		 int x=20;
	public void add()
	{    
		Method3 m= new Method3();
		System.out.println("method is running");
		System.out.println(m.x);
		m.x=m.x+20;
		System.out.println(m.x);
		System.out.println("method is ending");
	}
  	public static void main(String [] args)
   	{   
  		
  		System.out.println("main method running");
  		System.out.println(m.x);
  	        m.add();	
  
  		System.out.println("main method ends");
  	 }
	}

