package hierarchicalInheritance;

public class Childh2 extends ParentHierarchical{
	
	public void methodchildh2()
	{
		System.out.println("Childh2 Method");
		
	}
	

	public static void main(String[] args) {
		Childh2 child2=new Childh2();
		child2.parenthmethod1();
		child2.methodchildh2();

	}

}
