
public class depart implements Employee{
	

	public static void print1(){
		
	}
	@Override
	public void salary() {
		System.out.println("Salary granted");
	System.out.println(Employee.j);  	
	}

	@Override
	public void hr_policy() {
		System.out.println("Hr policy applied");
		
	}

	
	
	public static void main(String[] args) {
	  Employee e=new depart();
	  e.salary();
	  e.hr_policy();
	  depart.print1();
	 
	 

	}


}
