
public class Assi005_Fibonacci_Series {

	public static void main(String[] args) {
		int a=0, i=0;
		int b=1;
		int c=0;
		System.out.println(+a);
		System.out.println(+b);
	  /* for(int i=1;i<=10;i++)
	   {
		   c=a+b;
		   System.out.println(+c);
		   a=b;
		   b=c;
		   
	   }	*/
	 
		
		do{
			
			c=a+b;
			System.out.println(+c);
			a=b;
			b=c;
			
			i++;
	
		}while(i<=10);
		
	} 

}
