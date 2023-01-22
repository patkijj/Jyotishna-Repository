package pkj1;

public class GlobalVar3 {
	int a,b,c,d,e;
	public GlobalVar3(int a1,int a2, int a3,int a4,int a5)
	{
		a=a1;
		b=a2;
		c=a3;
		d=a4;
		e=a5;	
		}
	public static void main(String[] args) {
		GlobalVar3 obj1 = new GlobalVar3(12, 3, 40, 5, 33); //no call
		
		System.out.println("value of a "+ obj1.a); //call1
		System.out.println("value of b "+ obj1.b); //call2
		System.out.println("value of c "+ obj1.c); //call3
		System.out.println("value of d "+ obj1.d); //call4
		System.out.println("value of e "+ obj1.e); //call5
}
}