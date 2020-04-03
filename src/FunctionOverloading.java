

public class FunctionOverloading {
	//Function Overloading:Having same method names but with different parameters
	/*public static int a=30;
	public static int b=20;
		public static void addNumbers()
	{
		int c=a+b;
		System.out.println("The addition of two numbers: "+c);
	}
	public static void addNumbers(int r,int s)
	{
		int add=r+s;
		System.out.println("The addition of two numbers: "+add);
	}*/
//---------------------------------------------------------------------	
	public static int a=10;
	public static int b=11;
	/*public static void minNumber()
	{
		if(a<b)
		{
			System.out.println("minimum no is "+a);
		}
		else
			System.out.println("minimum no is "+b);
	}
	public static void minNumber(float x,float y)
	{
		if(x<y)
		{
			System.out.println("minimum no is "+x);
	    }
		else 
			System.out.println("minimum no is "+y);
	}*/
	
//-----------------------with int and float no----------------------------------------------
	public static int minNumber(int a,int b)
	{
		if(a<b)
		{
			System.out.println("min no is "+a);
		}else
			System.out.println("min no is "+b);
       return(a);
	}
	public static float  minNumber(float f,float d)
	{
		if(f<d)
		{
			System.out.println("min no is "+f);
		}else
			System.out.println("min no is "+d);
		return(f);
	}
	
	public static void main(String[] args) {
		
            /*addNumbers();
            addNumbers(30,40);*/
           /* minNumber();
            minNumber(10.1f,10.2f);*/
            
            minNumber(8, 9);
            minNumber(10.0f,11.0f);
      
           

		
	}

}
