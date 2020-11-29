       class Test29

	{
		public void wish()
		{
		System.out.println("good morining");
		}
	}
	class Demo29 extends Test29
	{
		public void wish()
		{
		System.out.println("good night");
		}

		public void task()
		{
		System.out.println("task completed");
		}
		
	}
	class TestDemo29
	{
		public static void main(String [] arg)
		{
			Demo29 d=new Demo29();
			d.wish();
			d.task();
			
			Test29 t=new Demo29();
			t.wish();
			//t.task();
			
			Demo29 d1=(Demo29)t;
			d1.task();
			d1.wish();
		}
	}