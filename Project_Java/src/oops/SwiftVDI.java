package oops;

public class SwiftVDI extends Swift{
public void mType()
{
	System.out.println("i m child");
}
public static void main(String[] args) {
	SwiftVDI vdi = new SwiftVDI();
	vdi.modelType();
	vdi.mType();
    vdi.price();
}
}
