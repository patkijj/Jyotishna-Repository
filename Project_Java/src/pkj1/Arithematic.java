package pkj1;

public class Arithematic 
{
	public int sum(int a, int b)
	{
		int c=a+b;
		System.out.println("sum result is "+ c);
		return c;
	}
	public int sub(int a1, int a2)
	{
		int r= a1-a2;
		System.out.println("Sub result is " + r);
		return r;
	}
	public void multi(int s1, int s2)
	{
		int result;
		result=s1*s2;
		System.out.println("final result " + result);
	}
	public static void main(String[] args) {
		Arithematic ref = new Arithematic();
		int sumResult=ref.sum(12, 2);
		int subResult=ref.sum(10, 2);
		ref.multi(sumResult, subResult );

	}
}
