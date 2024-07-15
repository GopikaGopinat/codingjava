package ninjas;
//prime number within a given limit
import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		int a=sc.nextInt();
		int b=sc.nextInt();
		for(int i=a;i<=b;i++)
		{
			int flag=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=1;
				}
			}
		
		if(flag==0)
		{
			count++;
		}
	}
		System.out.println("Count= "+count);
	}
}
