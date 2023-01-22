package pkj1;

public class Assign4 {
	public Assign4()
	{
        this(1,2,3);
		System.out.println("Default constructor");
	}
	public Assign4(int a)
	{
        this();
		System.out.println("one parameterized constr");
	}
	public Assign4(int a, int b)
	{
      this(1,2,3,4);
		System.out.println("two parametrized constr");
	}
	public Assign4(int a, int b, int c)
	{	
		System.out.println("three parametrized constr");
	}
	public Assign4(int a, int b,int c, int d)
	{
		this(1);
		System.out.println("four parametrized constr");
	}
	public static void main(String[] args) {

		Assign4 obj1 = new Assign4(30, 10);


	}
}
