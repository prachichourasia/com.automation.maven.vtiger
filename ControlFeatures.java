 class ControlFeatures
     {
     	 public Netflix controlling(int op)
	{
     
     if(op==1)
	{
		return new Audio();
	}
   else if(op==2)
	{
		return new Subtitles();
	}
   else if(op==3)
	{
		return new Video();
	}
	else
	{
	return new Netflix();
	} 
	}
      }