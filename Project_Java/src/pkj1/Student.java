package pkj1;

public class Student {
	int age,rollNo;
	
	public void m1()
	{
	System.out.println("welcome to all of you");
	}
	public void m2()
	{
		System.out.println("Automation is easy");
	}
    public static void main(String[] args) {
		Student st = new Student();
		st.m1();
		st.m2();
		st.age=15;
		System.out.println("Age of stu is " + st.age);
		st.rollNo=21;
		System.out.println("Roll no is " + st.rollNo);
	
    }
}
