public class Test123 
{
	String name;
	String gender;
	int age;
    Test123(String name,String gender,int age)
	{
	this.name=name;
	this.gender=gender;
	this.age=age;
	}
	 void m2()
	{
	System.out.println(name);
	System.out.println(gender);
	System.out.println(age);	
	}
public static void main(String [] arg)
	{
	Test123 t=new Test123("prachi","female",28);
	t.m2();
		
	}
	
}
