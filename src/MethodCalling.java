
public class MethodCalling {
	//Static component-->can not give a call to non-static component
    //directly(we need to create an object of a class)
//Static-->static(can give direct call)
//No1n-static-->non-static as well as static(can give direct call)
    public void go()
	{
		System.out.println("Inside GO method");
		go1();
		
	}
	public void go1()
	{
		System.out.println("Inside GO1 method");
		go2();
	}
	public void go2()
	{
		System.out.println("Inside GO2 method");
		
	}
    public static void go3()
    {
    	System.out.println("Inside GO3 method");
    	
    	
    }
	public static void main(String[] args) 
	{
		//MethodCalling m=new MethodCalling();
		//m.go();
		//m.go1();
		//m.go2();
		//go3();//no need of reference variable because its static method behave is same

	}

}
