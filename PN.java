import java.util.Scanner;
class PN
{
	public static void main(String[] args)
	{    
		Scanner s =new Scanner(System.in);
		System.out.println("enter the value of x");
		int num=s.nextInt();
		int temp=num;
		int count=0;
		
		int sum=0;
		int num1=num;
		while(num>0)
		{
			count++;
		}
		
		while(num1>0)
		{	
			int result=1;
			int rem=num1%10;
			for(int i=0;i<=count;i++)
			{
				result=result*rem;
			}
			sum=sum+result;
			num1=num1/10;
		}
		if(temp==sum)
		{
			System.out.println("number is Armstrong");
		}
		else
		{
			System.out.println("number is not Armstrong");
		}
	}

}
	

