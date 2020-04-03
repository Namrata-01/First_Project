
public class Assi001Calculator {
	
	
	/* public void add (int a,int b)
	{
		System.out.println("the addition of two no is" +(a+b));
	}
     
	public void sub (int x,int y)
	{
		System.out.println(("the subtraction of two no is" +(x-y)));
	}
	public void mult (int p,int q)
	{
		System.out.println(("the multiplication of two no is" +(p*q)));
	}
	public void div(int n,int o)
	{
		System.out.println(("the division of two no is" +(n/o)));
	} */
	
	public int add (int a,int b)
	{
		 System.out.println("The addition of two no is ");
		return (a+b);
	}
	 public int sub(int q,int w)
	{
		System.out.println("The subtraction of two no is ");
		return (q-w);
	}
	public int mult (int p,int o)
	{
		System.out.println("The multiplication of two no is ");
		return (p*o);
	}
	public int div (int n,int r)
	{
		System.out.println("The division of two no is ");
		return (n/r);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Assi001Calculator c= new Assi001Calculator();
       c.add(12,14);
       c.sub(12,14);
       c.mult(12,14);
       c.div(12,14); 
      int add,sub,mult,div;
      add=c.add(9,2);
      System.out.println(+add);
      sub=c.sub(5,9);
      System.out.println(+sub);
      mult=c.mult(0,0);
      System.out.println(+mult);
      div=c.div(1,1);
      System.out.println(+div);
       
	}

}
