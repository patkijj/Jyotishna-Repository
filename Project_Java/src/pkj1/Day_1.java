package pkj1;

public class Day_1 
{
int jyo;
public void m1()
{
System.out.println(" Welcome day01 ");

}
public static void main(String[]args)
{
Day_1 dc = new Day_1(); //obj creation
dc.jyo=123; //assigned value to variable
dc.m1();// call method
System.out.println("dc.jyo"); // print value
dc.jyo=333;   //change value
System.out.println(dc.jyo); //again print the value

}

}