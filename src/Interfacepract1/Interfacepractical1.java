package Interfacepract1;

public interface Interfacepractical1 
{
	
	public void methodinterface1();  //Before java 8 static method was not allowed
	                                 
	static void methodinterface2()
	{
		
		System.out.println("Akash Pattil");
	}
	
	default void methodface3()
	{
		System.out.println("Mahesh Nikam");
	}
	

}
