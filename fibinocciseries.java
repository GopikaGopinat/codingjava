package ninjas;
//fibinocci upto a given limit
import java.util.Scanner;

public class Fib1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0,b=1,sum=0;
		for(int i=0;i<n;i++)
		{
			System.out.print(a+" ");
			sum=a+b;
			a=b;
			b=sum;
		}	
	}
}
