class Covarient
{
	public Object audio()
	{
	System.out.println("standard audio speed running");
	return null;
	}
	public void videospeed()
	{
	System.out.println("standard video speed running");
	}
	public void subtitles()
	{
	System.out.println("standard subtitle running");
	}
	
}
class EX1 extends Covarient
{
    	public String audio()
	{
	System.out.println(" ==audio speed 1.5 running == ");
	return null;
	}
	
}
class EX2 extends Covarient
{
 	public void subtitles()
	{
	System.out.println("==selected subtitle running==");
	}
	
}