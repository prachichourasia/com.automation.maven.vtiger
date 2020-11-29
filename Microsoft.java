class Microsoft
{

	public void install()
	{
		System.out.println(" windows installation start");
	}

}
class Msworld extends Microsoft
{

	public void install()
	{
		System.out.println("msworld installation start");
	}

}
class Powerpoint extends Microsoft
{

	public void install()
	{
		System.out.println(" power point installation start");
	}

}
class Excel extends Microsoft
{

	public void install()
	{
		System.out.println(" Msexcle installation start");
	}

}
class Check
{

	public static void main(String[] args)
		
	{
		Microsoft ms=new Excel();
		ms.install();
	}

}

