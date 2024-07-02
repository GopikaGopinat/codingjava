package javaProgram;

import java.util.Scanner;

public class Menudrive {
	static int num1=40,num2=20,res;
	public static int add(int num1,int num2)
	{
		res=num1+num2;
		return res;
	}
	public static int sub(int num1,int num2)
	{
		res=num1-num2;
		return res;
	}
	public static int mul(int num1,int num2)
	{
		res=num1*num2;
		return res;
	}
	public static int div(int num1,int num2)
	{
		res=num1/num2;
		return res;
	}
	public static void main(String args[])
	{
		int choice;
		System.out.println("SIMPLE CALCULATOR");
		System.out.println("1.Addition\n 2.Subtraction\n 3.Multiplication\n 4.Division");
		System.out.println("Enter choice");
		Scanner s=new Scanner(System.in);
		choice=s.nextInt();
		switch(choice)
		{
		case 1:res=Menudrive.add( num1, num2);
		System.out.println("Sum is "+res);
		break;
		case 2:res=Menudrive.sub(num1, num2);
		System.out.println("Difference is "+res);
		break;
		case 3:res=Menudrive.mul(num1,num2);
		System.out.println("Product is "+res);
		break;
		case 4:res=Menudrive.div(num1,num2);
		System.out.println("Quotient is "+res);
		}
		
	}
}
