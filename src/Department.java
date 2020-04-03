
public class Department {

	
	//non-static global variables
		public String dept_name;
		public int dept_id;
		public int no_of_emp;
		
	//Global static variables
		public static String comp_name;
		
	//non-static function
		public void add_dept()
		{
			System.out.println("Department added");
		}
		
		public void change_dept()
		{
			System.out.println("Department changed");
		}
        
		//static function
		public static void national_holiday()
		{
			System.out.println("Natioanl holiday granted");
		}
	

}
