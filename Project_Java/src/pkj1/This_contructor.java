package pkj1;

public class This_contructor {
	public This_contructor()
	{
		System.out.println("Default constructor");
	}
	public This_contructor(int a)
	{
		System.out.println("one parameterized constr");
	}
	public This_contructor(int a, int b)
	{
		this(334); //call one parametrized constructor
		System.out.println("two parametrized constr");
	}
	public static void main(String[] args) {
		
		This_contructor obj1 = new This_contructor(303, 10);
		//This_contructor obj = new This_contructor();
		//This_contructor obj2 = new This_contructor(10, 20 );
	}
}
