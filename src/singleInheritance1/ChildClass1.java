package singleInheritance1;

public class ChildClass1 extends Parentclass {
	
	int b=20;
	public void method2()
	{
		System.out.println("Child method");
	}

	public static void main(String[] args) 
	{
		
		ChildClass1 obj=new ChildClass1();
		System.out.println(obj.a);
		obj.method1();
		System.out.println(obj.b);
		obj.method2();
		
	}

}
