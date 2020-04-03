
public class DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;//Declaration
		int i=123456789;//Initialization-->store integer values less than 10
		float f=1.234f;//store any no of values after decimal point but suffix f is need
		long l=12345678910l;//store integer values more than 10 l is suffix
		double d=1.23456677;//store float values more than 10 no need of suffix
		char c='s';//stores single character
		String s="This is a java tutorial";//stores multiple characters or sentence,String is a java class
         
		DataType dt;//dt is reference variable
		//Camel casing
		String a1= "batman_Begin";//some letter small and some letter capital
	    int batamn_begin;
		int TheDarkKnight;
		int theDarkKnightRaise;
	
		
		//String concatenation       
		String abc=new String();
		abc="Hello";
		String abc1="Hello";//abc and abc1 both are same because it store same values
        String s1="Way ";
		String s2="2 ";//we can also write 2 in ("2") it take as String value because of (" ")
		String s3="Automation";
		String s4=s1 +" "+s2 +" "+s3;
		System.out.println(s4);//enter Syso ( ctrl with space)
		System.out.println(s1+s2+s3);
		
		System.out.println("--------------------");
		//String+String-->String
		//int +int-->int
		int num1=10;
		int num2=5;
		System.out.println(num1+num2);//ans-->15
        System.out.println(num1+num2+"after");//ans-->15after
		System.out.println("before "+(num1+num2)+" after");//ans-->before 15 after
		System.out.println("before "+num1+num2+" after");//ans-->before 105 after
		System.out.println("after "+num1+num2);//ans-->after 105
		System.out.println("after "+(num1+num2));//ans-->after 15
		
		
		
		
		
	}

}
