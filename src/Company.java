
public class Company {

	public static void main(String[] args) {
		//Department d=new Department();
		/*d.dept_id=10;*/
		//d.dept_name="Telecom";
		//d.no_of_emp=1000;
//------------------------------------------------------------------------
//static function-->we can use object reference and it's class
//and variable name for access variable
		//d.comp_name="Microsoft";//for static
		Department.comp_name="Infotech";
//------------------------------------------------------------------				
       /* d.add_dept();
        d.change_dept();*/
        
        //d.national_holiday();
        Department.national_holiday();
        
       /* System.out.println("Department_id is: "+d.dept_id);
        System.out.println("Department_name is: "+d.dept_name);
        System.out.println("Number of employees is: "+d.no_of_emp);*/
       // System.out.println("Company name is: "+d.comp_name);
       // System.out.println("Company name is: "+Department.comp_name);
        System.out.println("Department name is: "+Department.comp_name);
       /* Department d1=new Department();//we can create any object
        d1.dept_id=20;
        d1.dept_name="Sales";
        d1.no_of_emp=2000;
        
        d1.add_dept();
        d1.change_dept();*/
        
      /*  System.out.println("Department_id is: "+d1.dept_id);
        System.out.println("Department_name is: "+d1.dept_name);
        System.out.println("Number of employees is: "+d1.no_of_emp);*/
       // System.out.println("Company name is: "+d1.comp_name);
	}

}
