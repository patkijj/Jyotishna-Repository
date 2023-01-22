package pkj1;

public class GlobalVar1 {
int a,b,c,d,e; // 5 global variable
public static void main(String[] args) {
	GlobalVar1 obj1 = new GlobalVar1();
	/*5 calls for obj1 for assigning the values*/
	obj1.a=33; //call1
	obj1.b=333; //call2
	obj1.c=122; //call3
	obj1.d=12;  //call4
	obj1.e=2;  //call5
	
	System.out.println("value of a "+ obj1.a); //call6
	System.out.println("value of b "+ obj1.b); //call7
	System.out.println("value of c "+ obj1.c); //call8
	System.out.println("value of d "+ obj1.d); //call9
	System.out.println("value of e "+ obj1.e); //call10
}
}
