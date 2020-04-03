import java.rmi.server.SocketSecurityException;

public class LearningMethod {
	//Return type:Datatype of the value returned by the method
	//Keyword : return
	 public void display()
	 {
		 System.out.println("Inside Display method");
		 //String x;
		 //return 10;
		 //return 100;
	 }
	 public void list(int a, String b)
	 
	 {
		 System.out.println("The value of a is :"+ a);
		 System.out.println("The value of b is :"+ b);
	 }
	 
	 public int number()
	 {
		 
		
		 return 10; 
	 }
	   
	 public void show()
	 {
		 System.out.println("Inside show method");
	 }

	public static void main(String[] args) 
	{
	// TODO Auto-generated method stub
      /*   LearningMethod l = new LearningMethod();
         l.display();
         l.show();
	     l.list(10, "Hello");
	     int b;
	   //  b=l.number();
	     //System.out.println(b); */
	   // int i;//Declaration
		InstanceLocalClassVariable v= new InstanceLocalClassVariable();
		v.i++;   //ans 11//
		InstanceLocalClassVariable v1= new InstanceLocalClassVariable();
		v1.i++;  //ans 12//
		InstanceLocalClassVariable v2=new InstanceLocalClassVariable();
		System.out.println(v2.i); //10//
		
		
      }
	}
