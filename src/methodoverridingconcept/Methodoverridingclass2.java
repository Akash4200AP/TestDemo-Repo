package methodoverridingconcept;

public class Methodoverridingclass2 extends Methooverridingclass1
{

	public void car()
	{
		super.car();
		System.out.println("Car color is Red");
		
	}
	
	public static void main(String[] args) 
	{
		Methodoverridingclass2 ov=new Methodoverridingclass2();
		ov.car(); 	
		
	}
	
	
}
