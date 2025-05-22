package multilevelInheritance;

public class ChildClass12 extends ParentClass {
	
	int b=30;
	public void methodChild()
	{
		System.out.println("Method child");
		
	}

	public static void main(String[] args) 
	{
		ChildClass12 obj1=new ChildClass12();
		System.out.println(obj1.a);
		System.out.println(obj1.str);
		System.out.println(obj1.b);
		obj1.methodgrand();
		obj1.methodparent();
		obj1.methodChild();
		
		


	}

}
