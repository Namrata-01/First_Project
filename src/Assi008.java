
public class Assi008 {

	public static void main(String[] args) {
	 /* int a[]={3,8,4,3};
	 int temp=0;
	  for(int i=0;i<a.length;i++)
	  {
		  if(a[i]%2==0)
		  {
			  
			  temp=temp+a[i];
			  System.out.println("even no is "+a[i]);
			  
			  
		  }
	  }System.out.println("addition of even no is" +temp);
	  
	  int temp1=0;
	  for(int j=0;j<a.length;j++)
	  {
		  if(a[j]%2 != 0)
		  {
			 
			  temp1=temp1+a[j];
			  System.out.println("odd no is "+a[j]);
			 
		  }
	  } System.out.println("addition of odd no is" +temp1);
	  
	  if(temp==temp1)
	  {
		  System.out.println("both addition is same");
	  }
	  else
	  {
		  System.out.println("both addition is not same");
	  }*/
		
//-----------------------------------------------------------------------		
		/*int a[]={1,2,3,4};
		int temp=0;
		System.out.println("even index is");
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{    
			temp=temp+a[i];
			System.out.println(+i);
			}
		}System.out.println("even index add is " +temp);
		
		
		System.out.println("odd index is");
		int temp1=0;
		for(int j=0;j<a.length;j++)
		{
			if(j%2!=0)
			{
				temp1=temp1+a[j];
				System.out.println(+j);
			}
		}System.out.println("odd index add is "+temp1);*/

//-----------------------------power of array-------------------------------------------		

		/*int a[]={1,2,3,4,5};
		System.out.println("Answer is");
		for(int i=0;i<a.length;i++)
		{
		   double d = Math.pow(a[i],i);
		   int no = (int) d;
		   System.out.println(no);
		}*/
		
//--------------------------------------------------------------------------------------		

	int a[]={6,2,4,4,4,1};
	
       int temp=0;
	    for(int i = 0; i < a.length / 2;) 
	    {  
	     int number1 = a[i];
	     int number2 = a[a.length - 1-i];
	     int sum = number1 + number2;
	     System.out.println(number1+ "+" +number2+ "=" +sum);
	     
	     for(int j=2;j<sum-1;j++)
	     {
	     if(sum%j!=0)
	       {
	    	 temp=temp+1;
	    	   i++;
	    	   int no1= a[i];
	  	     int  no2 = a[a.length - 1-i];
	  	     int sum1 = no1 + no2;
	  	     System.out.println(sum1);
             break;
	       }
           
	    }  
	}
	}
	}
	