import java.util.Scanner;

class Settings
{
	public static void main(String [] arg)
	{
	Scanner s=new Scanner(System.in);
	System.out.println("===================="+"\n"+
			    "Select the options"+"\n"+
			    "====================");
	System.out.println("settings options"+"\n"+
					      "1.change Audios"+"\n"+
					     "2.change Subtitles "+"\n"+
					      "3.change videospeed");
	int val=s.nextInt();
	ControlFeatures cf=new ControlFeatures();
	Netflix nf=cf.controlling(val);
	nf.subtitlesetting();
	nf.audiosetting();
	nf.videosetting();
	}
}