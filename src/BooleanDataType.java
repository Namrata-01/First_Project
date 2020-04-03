
public class BooleanDataType {

	public static void main(String[] args) {
		boolean b=true;
		System.out.println(10<20);
		
		//int first_no=10;
		//int first_no=30;
int first_no=10;
		int sec_no=20;
		int third_no=30;
		boolean result=first_no>sec_no;
		System.out.println(result);
		/*if(first_no>sec_no)
		{
			System.out.println("First no is greater "+first_no);
		}
		else 
			if(sec_no>first_no)
			{
				System.out.println("second no is greater "+sec_no);
			}
			else
			{
				System.out.println("both no.s are equal ");
			}
		{
			
		}*/
		
		if(first_no>sec_no && first_no>third_no)
		{
			
			System.out.println("First no is grater");
		}else
		
		if(sec_no>first_no && sec_no>third_no)
		{
			
			System.out.println("second no is grater");
		}else
			if(third_no>sec_no && first_no<third_no)
			{
				
				System.out.println("third no is grater");
			}else
			System.out.println("given no.s are equal");
				}
	}
