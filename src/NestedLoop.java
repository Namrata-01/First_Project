
public class NestedLoop {

	public static void main(String[] args) {
		//while-->3
		//for-->4
		//do while-->5
		//Loop will be executed 60 times
		int i=1;
		int count=0;
		while(i<=3)
		{
			for(int j=1;j<=4;j++)
			{    
			int k=1;
				do
				{
					System.out.println("i-->"+i+"j-->"+j+"k-->"+k);
					k++;
					count++;
				}while(k<=5);
			}
			i++;
		}
		
		
	}

}

