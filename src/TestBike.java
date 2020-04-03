
public class TestBike {

	public static void main(String[] args) {
		Bike b=new Bike();
		b.color="black";
		b.startBike();
	
		
		MakeHonda m=new MakeHonda();
		m.color="Blue";
		m.startBike();//MakeHonda
		 m.tyreType();
		
		Bike b1=new MakeHonda();
		b1.startBike();
		b1.stopBike();

	}

}
