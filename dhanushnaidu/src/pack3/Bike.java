package pack3;

public class Bike {
	
	String name;
	double price;
	
	public void Speed()
	{
		System.out.println("Raiding At speed 200kph");
	}
	
	public void Speed(String name)
	{
		System.out.println("Bike name is tvs");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b=new Bike();
		b.Speed();
		b.Speed("dhanush");
		
		
		

	}

}
