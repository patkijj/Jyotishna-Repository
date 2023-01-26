package oops;

public class FinalVariable {
final int a =123;// final variable value can't change
public static void main(String[] args) {
	FinalVariable f = new FinalVariable();
	f.a=334; // final var value can't change
	System.out.println("f.a");
	f.a=341; // final var value can't change
	System.out.println("f.a");
}
}
// if we make a class as final we can't inherit that class
// final variable value can't change