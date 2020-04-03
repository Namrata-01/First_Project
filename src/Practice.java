import java.util.HashSet;
public class Practice {

	
	public static void main(String[] args) {
		
		   /*int a[]=new int[3];
		   a[0]=1;
		   a[1]=3;
		   a[2]=4;
		   int rows=3;
		     for(int i=0;i<rows;i++)
		     {
		    	 for (int j=i+1;j<rows;i++)
		    	 {
		    	 if((a[i]>a[j]) && (i!=j))
		    	 {
		    		 System.out.println(+a[j]);}
		     }
			}*/
				/*int temp=0;
				int no=7;
				for(int i=2;i<no-1;i++)
				{
					if(no%i==0)
					{
						temp=temp+1;
					}
				}
				if(temp==0)
				{
					System.out.println("prime no");
				}
				else
				{
					System.out.println("not prime no");
				}*/
//---------------------------------------------------------------------				
				/*int a[]={11,12,13,14};
				int del=14;
				for(int i=0;i<a.length;i++)
				{
					if (del==a[i]) 
					{
						for(int j=i;j<a.length-1;j++)
						{
							a[j]=a[j+1];
						}
						
						break;	
					}
				}
				for(int i=0;i<a.length-1;i++)
				{
					System.out.print(+a[i]+ " ");
				}*/
//--------------------------merge two array-------------------------------			
			/*	int a[]={10,11,12};
				int b[]={20,21,22,23,24};
				//int a_leng=a.length;
				//int b_leng=b.length;
				int c[]=new int[a.length+b.length];//[a_leng+b_leng];
				
			 for(int i=0;i<a.length;i++)
			  {
				 c[i]=a[i];
			  }
				for(int j=0;j<b.length;j++)
				{
					c[a.length+j]=b[j];
				}
				for(int i=0;i<c.length;i++)
				{
					System.out.print(c[i]+ " ");
				}*/
//---------------------------------------------------------------------			  
				/*int temp=0;
				int a[]={1,2,3};
				for (int i=0;i<a.length;i++)
				{
					for(int j=i+1;j<a.length;j++)
					{
					   if((a[i]==a[j]) && (i!=j))
					   {
						   temp=temp+1;
						   System.out.println("duplicate element " +a[j]);
					     }   
					 }
					
					}
				if(temp==0)
				{
					System.out.println("not");
				}*/
		
//---------------------------------------------------------------------
		
	
		/*int a[]={10,20,30,40,50};
		int ele=100;
		int index=3;
		for(int i=a.length-1;i>index-1;i--)
		{
			a[i]=a[i-1];
		}
		a[index]=ele;
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+ " ");
		}*/

//---------------------Reverse element--------------------------------------------------		
		/*int a[]={1,2,3,4,5};
	int b[]=new int[a.length];
	int j=0;
		/*for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();*/
			/*for(int i=a.length-1;i>=0;i--)
			{
                b[j]=a[i];	
                
				System.out.print(b[j]+ " ");
		} */ 
//-----------------------Reverse String------------------------------------
		/*String name="jalajn";
		String a="";
		
		for(int i=name.length()-1;i>=0;i--)
		{
			 a=a+name.charAt(i);
			
		}
		System.out.print(a);*/
		
//------------------Delete an element-------------------------------------
	/*int a[]={10,20,30,40,50};
	int del=30;
	
	for(int i=0;i<a.length-1;i++)
	{
		if(del==a[i])
		{
			for(int j=i;j<a.length-1;j++)
			{
				a[j]=a[j+1];
		    }
	}
	}
       for(int i=0;i<a.length-1;i++)
       {
    	   System.out.println(a[i]);
       }*/
//----------------Remove duplicate element-------------------------------
		/*int a[]={10,11,10,12,11};
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0;i<a.length;i++)
		{
			hs.add(a[i]);
		}
       
		for(int no:hs)
        {
    	   System.out.print(no+ " ");
       }*/
//---------------------duplicate element---------------------------------
		/*int a[]={10,11,10,12};
		for (int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j] && (i!=j))
				{
					System.out.println(a[j]);
					System.out.println(j);
				}
			}
		}*/
//---------------------		
     int a[]={10,16,12,11,15};
     int temp=0;
     for(int i=0;i<a.length-1;i++)
     {
    	 for(int j=i+1;j<a.length-1;j++)
    	 {
    		 if(a[i]<a[j])
    		 {
    			 temp=a[i];
    			 a[i]=a[j];
    			 temp=a[j];
    		 }
    	 }
     }
     for(int i=0;i<a.length;i++)
     {
    	 System.out.println(a[i]);
     }
     
	}}

 		


