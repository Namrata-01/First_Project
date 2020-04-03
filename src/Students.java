
public class Students {
	/*Properties of constructor
	 * 1.Constructor has same name as the class name
	 * 2.Constructor has no return type
	 * 3.It is called automatically when an object of the class
	 * is created
	  */
	
	//Deafault constructor
	public Students()
	{
		System.out.println("Adding studets records");
	}
	
	//Argumented constructor
	public Students(String name,int roll,int age)
	{
		this.name=name;//this.name refers to the global variables
		this.roll=roll;
		this.age=age;
	}
	
	String name;
	int roll;
	int age;
	
	public static void main(String[] args) {
     Students s1=new Students();
     s1.name="Tom";
     s1.roll=10;
     s1.age=20;
     
     Students s2=new Students();
     s2.name="Jack";
     s2.roll=13;
     s2.age=34;
     
     Students s3=new Students("Jalaj",18,22);
     
     System.out.println("Argumented constructor name: "+s3.name);
     System.out.println("Argumented constructor roll: "+s3.age);
     System.out.println("Argumented constructor age: "+s3.roll);
	}

}
