class Person
{
	String name;
	String gender;
	int age;
	Person(String name,String gender,int age)
	{
		this.name=name;
		this.gender=gender;
		this.age=age;
	}
}
public class Employee 
{
	int salary;
	String designation;
	public Employee(String name,String gender,int age,int salary,String designation) 
	{
		super(name,gender,age);
		this.salary=salary;
		this.designation=designation;
	}
	public static void main(String[] args) 
	{
		Employee e=new Employee("prachi","female",27,45000,"Testeng");
	}
}
