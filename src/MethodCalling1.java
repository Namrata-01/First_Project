
public class MethodCalling1 {
	// method calling in method
	public void go()
	{
		System.out.println("Inside Go method");
		go2();
		System.out.println("After Calling go2 method");
	}
	public void go1()
	{
		System.out.println("Inside go1 method");
		go();
		System.out.println("After calling go method");
	}
	public void go2()
	{
		System.out.println("Inside go2 method");
	}
	public static void main(String[] args) {
		MethodCalling1 m= new MethodCalling1();
		m.go1();
		System.out.println("After calling go1 method");
		}

}
