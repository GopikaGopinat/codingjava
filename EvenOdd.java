package ninjas;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,even=0,odd=0;
		n=sc.nextInt();
	    while(n>0)
		{
			int digit=n%10;
			if(digit%2==0)
	
				even=even+digit;
			}
			else
			{
				odd=odd+digit;
			}
			n=n/10;
		}
		System.out.println(even+" "+odd);
		
		}	
}
