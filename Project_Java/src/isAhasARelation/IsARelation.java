package isAhasARelation;

public class IsARelation extends Day5Assignment3{
public void m2() {
	System.out.println("from IS-A relationship by inheritance");
}
public static void main(String[] args) {
	IsARelation obj1 = new IsARelation();
	Day5Assignment3 obj2 = new Day5Assignment3(); // is a relationship
	obj1.m1();
	obj1.m2();
	obj2.m1(); // call one method from another class which has inheritance relation by extends keyword
}
}
