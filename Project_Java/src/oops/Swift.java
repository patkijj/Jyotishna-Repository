package oops;

public class Swift extends Maruti {
public void modelType()
{
	System.out.println("it is swift model");
}
public static void main(String[] args) {
	Swift re = new Swift ();
	re.price();
	re.price=233;
	System.out.println("price is "+re.price);
	re.modelType();
	System.out.println();
}
}
