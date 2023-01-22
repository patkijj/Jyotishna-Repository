package pkj1;

public class Basic_constructor {
public Basic_constructor()
{
	System.out.println("Default constructor");
}
public Basic_constructor(int a)
{
	System.out.println("one parameterized constr");
}
public Basic_constructor(int a, int b)
{
	System.out.println("two parametrized constr");
}
public static void main(String[] args) {
	//Basic_constructor obj = new Basic_constructor();
	Basic_constructor obj1 = new Basic_constructor(303);
	Basic_constructor obj = new Basic_constructor();
	Basic_constructor obj2 = new Basic_constructor(10, 20 );
}
}
