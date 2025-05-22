package polymorphism;

public class MethodOverloadingconcept {
	
	public void method1(int a, int b)//3
	{
	  int  c=a+b;
	  System.out.println(c);
	}
	public void method1(float a, float b)//3
	{
		float d=a-b;
		System.out.println(d);
	   			
	}
	
	public static void main(String abc)
	{
		
		System.out.println(abc);
	}
	
	public static void main(String[] args) 
	{
		MethodOverloadingconcept objp=new MethodOverloadingconcept();
		objp.method1(10, 20);
		objp.method1(10.0f, 5.5f);
		objp.main("akash");

}
}


//Three key points needs to be remember
//1- No of parameter
//2- DataType of parameter
//3- Sequence of parameter
