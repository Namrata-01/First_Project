import java.util.Scanner;
public class Assi003_Prime_No {

	public static void main(String[] args) {
		//program to find given no is Prime or not

		/*int no=10;
		int temp=0;
		for(int i=2;i<=no-1;i++)
		{
			if(no%i==0)
			{
				temp=temp+1;
			}
		}	
			if(temp>0)
			{
				System.out.println("not prime no");
			}
	        else 
	        {
			System.out.println("prime no");
	        }*/
		int temp=0;
		for(int no=1;no<=10;no++)
		{
			for(int i=2;i<=no-1;i++)
			{
				if(no%i==0)
				{ 
				  temp=temp+1;
				}
			}
		
	       if(temp==0)
	       {
	    	   System.out.println("prime "+no);
	       }
	       else
	       {
	    	   System.out.println("not prime "+no);
	    	   temp=0;
	       }
	}
	}

}

