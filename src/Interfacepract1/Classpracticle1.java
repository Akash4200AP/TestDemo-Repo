package Interfacepract1;

public class Classpracticle1 implements Interfacepractical1
{

	@Override
	public void methodinterface1() {
		
		System.out.println("I am a Tester");
		
	}
	public static void main(String[] args) 
	{
		Classpracticle1 xyz=new Classpracticle1();
		xyz.methodinterface1();
		Interfacepractical1.methodinterface2();//Static method can be accessed using Interface name only
		xyz.methodface3(); //If we want to call default method, we need to call by object reference only
	}
}
