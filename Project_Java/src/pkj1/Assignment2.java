// (((((10+2)+2)-2)*2)/2)
package pkj1;

public class Assignment2 {
public int sum(int a, int b)
{
	int c=a+b;
	System.out.println("sum result is "+ c);
	return c;	
}
public int sub(int c, int d)
{
	int e=c-d;
	System.out.println("sum result is "+ e);
	return e;
}
public int multi(int m1, int m2)
{
	int m= m1*m2;
	System.out.println("multi result is " + m);
	return m;
}
public void div(int d1, int d2)
{
int d=d1/d2;
System.out.println("div result is "+ d);
}
public static void main(String[] args) {
	Assignment2 obj = new Assignment2();
	int sumResult1 =obj.sum(10, 2); // 12
	int sumResult2=obj.sum(sumResult1, 2); //14
	int subResult=obj.sub(sumResult2, 2); //12
	int multiResult=obj.multi(subResult, 2);//24
	obj.div(multiResult, 2); // 12
}
}
