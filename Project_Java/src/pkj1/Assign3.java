// (((((10/2)-2)+2)-2)*2)
package pkj1;

public class Assign3 {
	public int div(int d1, int d2)
	{
		int d=d1/d2;
		System.out.println("div result is "+ d);
		return d;
	}
	public int sub (int s1, int s2)
	{
		int s=s1-s2;
		System.out.println("sub result is "+ s);
		return s;
	}
	public int add(int a1, int a2)
	{
		int a=a1-a2;
		System.out.println("sub result is "+ a);
		return a;
	}
	public int multi(int m1, int m2)
	{
		int m=m1*m2;
		System.out.println("multi result is "+ m);
		return m;
	}
	public static void main(String[] args) {
		Assign3 obj1 = new Assign3();
		int divResult=obj1.div(10,2); //10/2=5
		int subResult=obj1.sub(divResult, 2);	//5-2=3	
        int addResult =obj1.add(subResult, 2);  //3-2=1
        int subResult1 =obj1.sub(addResult, 2); // 1-2=-1
        obj1.multi(2, subResult1); //-1*2=-2
        
	}
}
