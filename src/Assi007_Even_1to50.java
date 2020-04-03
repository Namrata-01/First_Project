import java.util.Scanner;

public class Assi007_Even_1to50 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter your no");
		int n=s.nextInt();
		/*System.out.println("even no is");
		for(int i=1;i<=50;i++)
		{
			if(i%2==0)
				System.out.println(+i);
		}*/
             
		/*System.out.println("even no");
		int i=1;
		while(i<=n)
		{
			if(i%2==0)
				System.out.println(+i);
			i++;
		}*/
		int i=1;
		System.out.println("even no");
		do
		{
		
			if(i%2==0)
				System.out.println(+i);
				
			i++;
		}while(i<=n);
		
		}

}
