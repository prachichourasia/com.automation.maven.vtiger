public class BookRide 
{
	public void Booking(int x)
	{
		System.out.println("cab is booking");
	}
	public void Booking(String auto)
	{
		 System.out.println("auto is booking");
	}
	public void Booking()
	{
		System.out.println("activa is booking");
	}
	public static void main(String[] args)
	{
	BookRide b=new BookRide();
	b.Booking(20);
	b.Booking("auto");
	b.Booking();
	}

}