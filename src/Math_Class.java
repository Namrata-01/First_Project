
public class Math_Class {
   // public static int a;
   // public static int b;
    
    public static float minNumber(int a,int b)
    {
    	System.out.println("min no for int "+Math.IEEEremainder(a, b));
    	return (a);
    }
    public static float minNumber(float x,float y)
    {
    	System.out.println("max no for float "+Math.max(x, y));
    	return(x);
    }
    public static void main(String[] args) {
       
    	minNumber(12,14);
          minNumber(11.2f,12.7f);
	}
}