
public class CallByRefrence {

	int s;
	int t;
	
	//static int count;
	
	public static void swap(CallByRefrence c)
	{
		
		int temp = c.s;
		c.s = c.t;
		c.t = temp;
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		CallByRefrence c = new CallByRefrence();
		c.s=10;
		c.t=20;
		
		swap(c);
		
		
		System.out.println(c.s);
		System.out.println(c.t);
		
		
		
		
		
		
	}

}
