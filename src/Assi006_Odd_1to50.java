import java.util.Scanner;

public class Assi006_Odd_1to50 {

	public static void main(String[] args) {
		
		//int i=7;
		Scanner s=new Scanner(System.in);
	System.out.println("enter your no");
	int no=s.nextInt();
		/*for(int i=1;i<=no;i++)
		{
		if(i%2==0)
		{
			System.out.println("even no" +i);
		}
		else
			System.out.println("odd no" +i);
		
		}*/

System.out.println("odd no");
	int i=1;
	while(i<=no)
	{
		if(i%2!=0)
		{
			System.out.println(+i);
		}
		i++;
	}
	
	    /* int i=1;
		System.out.println("odd no");
		do
		{
			if(i%2!=0)
			{
				System.out.println(+i);
			}
			i++;
		}while(i<=no);*/
		
		
		
		
		
		
		
		/*System.out.println("odd no is");
	     for(int i=1;i<=50;i++)
	     {
	    	
	    	 if(i%2!=0)
	    		 System.out.println(+i);
	     }*/
	
	}
}
