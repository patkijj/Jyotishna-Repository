package oops;

import java.util.Scanner;

public class Scanner1 {
	
public static void main(String[] args)
{
	System.out.println("enter values");
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	System.out.println("value of a "+a);
	float f = sc.nextFloat();
	System.out.println("value of f "+f);
	String s = sc.next();
	System.out.println("value of s "+s);
}
}
