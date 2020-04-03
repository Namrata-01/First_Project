import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) 
	{
		//int month=(int)(Math.random()*30);
		//System.out.println(month);
		/*Scanner s=new Scanner(System.in);
				System.out.println("enter your no");
		int month=s.nextInt();*/
      /* int month=5; 
		switch(month){
		case 1:
			System.out.println("jan");
			break;
			
		case 2:
			System.out.println("feb");
			break;
		case 3:
			System.out.println("mar");
			break;
		case 4:
			System.out.println("Apr");
			break;
		case 5:
			System.out.println("May");'
			break;
		case 6:
			System.out.println("jun");
			break;
		case 7:
			System.out.println("jul");
			break;
		case 8:
			System.out.println("Aug");
			break;
		case 9:
			System.out.println("Sep");
			break;
		case 10:
			System.out.println("Oct");
			break;
		case 11:
			System.out.println("Nov");
			break;
		case 12:
			System.out.println("Dec");
			break;		
      	default:
				System.out.println("Invalid Month");
		}*/
//------------------------------------Assignment--------------------------------------------
	/*Scanner a=new Scanner(System.in);
	System.out.println("enter your char");
	char c=a.next().charAt(0);
	switch(c)
	{
	case 'a':
		System.out.println("Excellent");
		break;
	case 'b':
		System.out.println("Welldone");
		break;
	case 'c':
		System.out.println("Good");
		break;
	case 'd':
		System.out.println("You Passed");
		break;
	case 'f':
		System.out.println("Better Try  Again");
		break;
	default:
		System.out.println("Invalid Grade");
	}System.out.println("youre grade is "+c );*/
			
	
	
//-----------------------Assignment----------------------------------------
	/*Scanner s=new Scanner(System.in);
	System.out.println("enter your string");
	String a=s.nextLine();*/
	/*String a="Intermediate";	
	switch(a)
	{
	case "Beginers":
		System.out.println("Level is 1");
		break;
	case "Intermediate":
		System.out.println("Level is 2");
		break;	
	case "Expert":
		System.out.println("Level is 3");
		break;
		default:
			System.out.println("Level is 0");
		
			
	}*/
//---------------------------------------------------------------------	
	
	
	/*Scanner a=new Scanner(System.in);
	System.out.println("enter no");
	int i=a.nextInt();
	switch(i)
	{
	case 1:
		System.out.println("Sun");
		break;
	case 2:
		System.out.println("Mon");
		break;
	case 3:
		System.out.println("Tue");
		break;
	case 4:
		System.out.println("Wed");
		break;
	case 5:
		System.out.println("Thu");
		break;
	case 6:
		System.out.println("Fri");
		break;
	case 7:
		System.out.println("Sat");
		break;
	default:
		System.out.println("Invalid Day");
	}*/
//----------------------------------------------------------------------		
	 Scanner s = new Scanner(System.in);
	 System.out.println("enter first no");
	 int a=s.nextInt();
	 System.out.println("enter second no");
	 int b=s.nextInt();
	 System.out.println("Select operator");
	     char operator=s.next().charAt(0);
	     
	    
	int res;
	switch(operator){
	case '+': 
		res=a+b;
		System.out.println("addition is "+res);
		break;
		
	case '-':
		res=a-b;
		 System.out.println("subtraction is "+res);
		 break;
		 
	case '*': 
		res=a*b;
		System.out.println("multiplication is "+res);
		break;	
		
	case '/': 
		res=a/b;
		System.out.println("division is "+res);
		break;
	default:
		System.out.println("Invalid operator");
		 
	   
	}
		
	
	  
	     
	      
	     
	 
	 
	 
	 
	 

	   /* while(scanner.hasNext())
	    {
	        System.out.println(scanner.nextInt());
	    }*/
		
		/*int a=10;
		int b=20;
		int c='-';
		//int d=a+b;
		
		switch(c)
		{
		case '+':
			
		 System.out.println("addition of two no.s "+(a+b));
		 break;
		 
		case '-':
			System.out.println("subtraction of two no.s ");
       	break;
		
		case '*':
			 System.out.println("Multiplication of two no.s ");
			 break;
			 
		case '/':
		    System.out.println("division of two no.s ");
		    break;
		    
		}*/
			 
			 
       	
			 
			 
		}
		
	
	
}

