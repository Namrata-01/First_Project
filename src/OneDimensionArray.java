import java.util.Scanner;

public class OneDimensionArray {

	public static void main(String[] args) {
		
		/*int a[]=new int[5];//declaration and instantiation
		a[0]=10;//initialization
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		 //traversing array
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);*/
//-------------------------------------------------------------------------		
		/*int b[]={33,3,4,5};//declaration, instantiation and initialization
		//printing array values
		for(int i=0;i<b.length;i++)
			System.out.println(b[i]);
//--------------------------------------------------------------------------		
		
		String[] c;//declare without size
		String[] d=new String[3];//declare with size
//------------------------------------------------------------------------		
		//inline initialization
		String[] e=new String[] {"A","B","C"};
		String[] f={"A","B","C"};
//------------------------------------------------------------------------
		//initialization after declaration
		String[] strArray4 = new String[3];
		strArray4[0]="A";
		strArray4[1]="B";
		strArray4[2]="C";
		
		String[] month={"Jan","Feb","March"};
		
		System.out.println(month[0]);
		for(int i=0;i<month.length;i++)
		{
			System.out.print(month[i]+" ");
		}
		System.out.println();
		System.out.println(month.length);*/
//--------------------Total and avg----------------------------------------------
		/*int j[]=new int[3];
		j[0]=10;
		j[1]=11;
		j[2]=12;
		int total=0;
		int avg=0;
		for(int i=0;i<j.length;i++)
		{
			//System.out.println(j[i]);
			total=total+j[i];
			
			avg=total/j.length;
			
		}System.out.println(+total);
		System.out.println(+avg);*/
		
//------------------Addition of two array-------------------------------------------------
		/*int i[]={1,2,3};
		int j[]={4,5,6};
		int c[]=new int[i.length];
		//int c=0;
		
		//int c=0;
		
		for (int k=0;k<i.length;k++)
		{
			 c[k]=i[k]+j[k];
			 System.out.print(c[k]+" ");
			}*/
		
//---------------------Duplicate element----------------------------------------
	String[] a={"abc","pqr","stw","abc","xyz","pqr"};
//int a[]={1,3,3,2,4,5};
 System.out.println("Duplicate elements are");
		for(int i=0;i<a.length;i++)
	    {
		  for(int j=i+1;j<a.length;j++)
		  {
		     if((a[i]==a[j]) && (i!=j))
		     {
			 System.out.println(a[j]);
		     }
		  }
	
	 }
		
//------------------------------------------------------------------
		/*Scanner s=new Scanner(System.in);
		System.out.println("Enter your no");
		int a=s.nextInt();
	int	temp=0;
		int b[]={10,11,12,13};
		for(int i=0;i<b.length;i++)
		{
			if(a==b[i])
			{    temp=temp+1;
				System.out.println("element is found which is " +b[i]);
				System.out.println("location is  " +i);
				
			}
		}
			
				if(temp==0)
				{
					System.out.println("element not found");			
				}
				else
				{
				  temp=0;
				}*/
//------------------element found or not-----------------------------
		Scanner s=new Scanner (System.in);
		System.out.println("enter your no");
		int no=s.nextInt();
		int num[]={10,20,30,40,50};
		for(int i=0;i<a.length;i++)
		{
			if(num[i]==no){
				System.out.println("no is found"+num[i]);
			System.out.println("location is" +i);
			break;
		}
		}
	if(no==num.length)
		System.out.println(no+"number is not found in array");
		}
			
}
	