/* (((((x1*x2)-x3)+x4)-x5)/x6) */
package oops;

import java.util.Scanner;

public class AssignScanner2 {
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
		int p, q;
		int sumvar, subvar, mulvar, divvar;
		AssignScanner2 ob = new AssignScanner2();
		
		System.out.println("Enter 1st no to multiply ");
		Scanner sc = new Scanner(System.in);
		p = sc.nextInt();
		System.out.println("Enter 2nd no to multiply ");
		q = sc.nextInt();
		mulvar = ob.multiply(p, q);
		
		System.out.println("Enter any no to subtract ");
		p = sc.nextInt();
		subvar = ob.sub(mulvar, p);
		
		System.out.println("Enter any no to add ");
		p = sc.nextInt();
		sumvar = ob.sub(subvar, p);
		
		System.out.println("Enter any no to subtract ");
		p = sc.nextInt();
		subvar = ob.sub(sumvar, p);
		
		System.out.println("Enter any no to divide ");
		p = sc.nextInt();
		divvar = ob.sub(subvar, p);
		
		System.out.println("total "+ divvar);
		
		
		
}
}