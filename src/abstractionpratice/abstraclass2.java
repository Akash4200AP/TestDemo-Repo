package abstractionpratice;

public class abstraclass2 extends abstrclass1 
{
	@Override
	void method123() 
	{
		System.out.println("Implementation of the method");
		
	}

	public static void main(String[] args) 
	{
		abstraclass2 objec=new abstraclass2();
		objec.method123();
		objec.method1234();
	}

	
}
