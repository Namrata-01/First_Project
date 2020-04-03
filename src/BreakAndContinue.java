
public class BreakAndContinue {
//Scope of break is within the loop only
//Continue-->Is used to skip iterations(Continue to the next cycle i.e.i++)

	/*public void go()
	{
		System.out.println("First");
		//break;
		System.out.println("Last");
	}*/
	public static void main(String[] args) {
		//BreakAndContinue b=new BreakAndContinue();
		//b.go();
		
		for(int i=0;i<10;i++)
		{
			if(i==5)
				break;
		System.out.println(i);
		}
//----------------------------Continue------------------------------------------	
	/*for(int i=0;i<10;i++)
	{
		if(i>=5 && i<=7)
		//if(i>=0)
			continue;
	System.out.println(i);
	}
	System.out.println("Outside the loop");*/
	}
}
