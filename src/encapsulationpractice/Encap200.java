package encapsulationpractice;

public class Encap200 extends Encap100 {

	public static void main(String[] args) 
	{
		Encap200 abcd=new Encap200();
		abcd.setter(10, 20);
		System.out.println(abcd.getter());
	}

}

