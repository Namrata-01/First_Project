
public class SwapNumbers {
	//pass by value-->Create copy of the reference and change will
		//be done in copied object only and not in the original object.
		//Change will be reflected in method or function only and
		//not in the main method
			
	    //Pass by reference-->Change will be done in the original 
	    //reference and will reflect it in main method
			
		    int s;
			int t;
			
			
			 // Pass by Value
			  public static void swap(int a,int b)
			  {
			  int temp=a;
			  a=b;
			  b=temp;
			  System.out.println("A "+a);
			  System.out.println("B "+b);
			  }
			 
	         
		/*	public static void swap(SwapNumbers p)
			{
				//Pass by Reference
				int temp=p.s;
				p.s=p.t;
				p.t=temp;
			
			}*/
	           
	public static void main(String[] args) {
		SwapNumbers sw=new SwapNumbers();
		//pass by value
		//swap(10,20);
		
		sw.s=50;
		sw.t=100;
	
		//swap(sw);//pass by reference
		sw.swap(sw.s,sw.t);//pass by value
		
	 // System.out.println("Pass by values, a is: "+sw.s);
	  //System.out.println("Pass by values, b is: "+sw.t);
	
	  System.out.println("Pass by refernce, s is: "+sw.s);
	  System.out.println("Pass by reference, t is: "+sw.t);
	}

}
