package javaProgram;

import java.util.Scanner;

public class Primeno {
	public static void main(String args[])
	{
		int i,n,flag=0;
		System.out.println("Enter a number");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(i=2;i<=n/2;i++)
		{
		if(n%i==0)
		{
			flag=1;
			break;
		}
	}
		if(flag==0)
		{
			System.out.println("prime number");
		}
		else {
			System.out.println("Not prime");
		}

}
}
