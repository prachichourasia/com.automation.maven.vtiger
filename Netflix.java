class Netflix
{
	public void audiosetting()
	{
	System.out.println("standard audio speed running");
	}
	public void videosetting()
	{
	System.out.println("standard video speed running");
	}
	public void subtitlesetting()
	{
	System.out.println("standard subtitle running");
	}
	
}
	
class Audio extends Netflix
{
    	public void audiosetting()
	{
	System.out.println(" ==audio speed 1.5 running == ");
	}
	
}
class Subtitles extends Netflix
{
 	public void subtitlesetting()
	{
	System.out.println("==selected subtitle running==");
	}
	
}
class Video extends Netflix
{
	public void videosetting()
	{
	System.out.println("==video speed 1.5 running==");
	}
}