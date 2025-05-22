package MultipleInheritancetest;

public class Classnormal implements Interfaceparent1,Interfaceparent2 {

	@Override
	public void methodinterfaceparent1() {
		
		System.out.println("Interfaceaprent1 method");
		
	}
	
	@Override
	public void methodinterfaceparent2() {
		
		System.out.println("Interfaceaprent2 method");
		
	}

	public void methodchildnormal()
	{
		
		System.out.println("Childnormal method");
	}
	
	public static void main(String[] args) 
	{
		Classnormal abc=new Classnormal();
		abc.methodinterfaceparent1();
		abc.methodinterfaceparent2();
		abc.methodchildnormal();

	}

	

}
