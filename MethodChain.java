public class Palindrom2 {

	public void m1(int num)
	{   
		int sum=0;
		if(num>0)
		{
		int rem=num%10;
		sum=sum*10+rem;
		num=num/10;
		}
		else
			System.out.println("palindrom number is"+sum);
	}
	public static void main(String[] args)
	{
		Palindrom2 a=new Palindrom2();
	    a.m1(153);	
	}

}
