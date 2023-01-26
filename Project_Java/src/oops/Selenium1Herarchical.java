package oops;

public class Selenium1Herarchical extends AutomationParentHerarchical {
public void m2()
{
	System.out.println("i am child 1");
}
public static void main(String[] args) {
	Selenium1Herarchical ob = new Selenium1Herarchical();
	ob.m1();
	ob.m2();
}
}
