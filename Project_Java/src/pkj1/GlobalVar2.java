/*Assigning values to global variable through constructor to reduce calls*/
package pkj1;

public class GlobalVar2 {
int a,b,c,d,e;
public void m1(int a1,int a2, int a3,int a4,int a5)
{
	a=a1;
	b=a2;
	c=a3;
	d=a4;
	e=a5;	
	}
public static void main(String[] args) {
	GlobalVar2 obj1 = new GlobalVar2();
	obj1.m1(22, 2, 34, 5, 6); // call1
	
	System.out.println("value of a "+ obj1.a); //call2
	System.out.println("value of b "+ obj1.b); //call3
	System.out.println("value of c "+ obj1.c); //call4
	System.out.println("value of d "+ obj1.d); //call5
	System.out.println("value of e "+ obj1.e); //call6
}
}
