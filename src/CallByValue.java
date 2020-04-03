
public class CallByValue {

	
	
   static int s;
   static int  t;
    
    
    public static void swap(int a,int b)
    {
    	int temp = a; 
    	a = b;
    	b = temp;
    	
    }
	
	
	public static void main(String[] args) {
		
		CallByValue.s=10;
		CallByValue.t=20;
		
		
		swap(CallByValue.s,CallByValue.t);
		
		System.out.println(CallByValue.s);
		System.out.println(CallByValue.t);
		
		
		
		
		
		
		
	}

}
