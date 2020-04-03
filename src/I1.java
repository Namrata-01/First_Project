
public interface I1 {

	
	public void display();
	
	public default void print()
	{
		System.out.println("print");
	}
}
