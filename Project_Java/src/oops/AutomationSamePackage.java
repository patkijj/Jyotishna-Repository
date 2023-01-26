package oops;

import pkj1.AutomationAnotherpakage;

public class AutomationSamePackage extends AutomationAnotherpakage {
public void m()
{
	System.out.println("calling method from class outside package");
}
public static void main(String[] args) {
	AutomationSamePackage a = new AutomationSamePackage();
	a.m();
	a.m1();
	
}
}
