import java.util.Scanner;

public class IfElseStatement {
	//If , If else , If else If statement

	public static void main(String[] args) {
		int num=(int) (Math.random()*20);
		System.out.println(num);
		if(num>10)
			System.out.println(num+" is greater than 10");
		else
			if(num<=10 && num>=5)
			System.out.println(num+ " is between 5 and 10");
			else
				System.out.println(num+" is less  than 10");
	
	
		
  //program to find given no is odd or even by using scanner
		int n;
		Scanner s=new Scanner(System.in); //scanner is Class
		System.out.println("Enter the number you want to check:");
		n= s.nextInt(); //nextInt() is method
		if(n% 2 ==0)
		{
			System.out.println("The given number "+n+" is Even");
	    }
		else
		{
			System.out.println("The given number "+n+" is odd");
	    }
			
	}
	}


