package hierarchicalInheritance;

public class Childh1 extends ParentHierarchical {
	
	public void methodchildh1()
	{
		System.out.println("Childh1 Method");
		
	}

	public static void main(String[] args) {
		Childh1 child1=new Childh1();
		child1.parenthmethod1();
		child1.methodchildh1();

	}

}
