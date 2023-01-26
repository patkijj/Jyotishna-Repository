package oops;

public class APIautomation2Herarchical extends AutomationParentHerarchical {
public void m3()
{
	System.out.println("i am child 2");
}
public static void main(String[] args) {
	APIautomation2Herarchical obj = new APIautomation2Herarchical();
	obj.m1();
	obj.m3();

}
}
