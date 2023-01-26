// ((((x1+x2)+x3)-x4)/x5)*x6) through scanner class
package oops;

import java.util.Scanner;

public class AssignScanner {
public int add(int a, int b)
{
return a+b;

}
public int sub(int a, int b)
{
	return a-b;	
}
public int multiply(int a, int b)
{
	return a*b;
}
public int divide(int a, int b)
{
	return a/b;	
}
public static void main(String[] args) {
	int p, q, r;
	int sum1, sum2, subvar, mulvar, divvar, total;
	AssignScanner obj = new  AssignScanner();
	System.out.println("enter 1st no. to sum: ");
	Scanner s = new Scanner(System.in);
	p = s.nextInt();
	System.out.println("enter 2nd no. to sum: ");
	q = s.nextInt();
	System.out.println("enter 3rd no. to sum: ");
	r = s.nextInt();
	
	sum1 = obj.add(p, q);
	sum2 = obj.add(sum1, r);
	
	 System.out.println("sumvariable is "+sum2);
	 
	 System.out.println("Enter no. to substarct: ");
	 p= s.nextInt();
	 
	 subvar = obj.sub(sum2,p);
	 
	 System.out.println("Enter no. to divide: ");
	 p= s.nextInt();
	 
	 divvar = obj.divide(subvar,p);
	 
	 System.out.println("Enter no. to multiply: ");
	 p= s.nextInt();
	 
	 mulvar = obj.multiply(divvar,p);
	 
	 System.out.println("Total: "+ mulvar);
}
}
