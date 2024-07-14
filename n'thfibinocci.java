package ninjas;
import java.io.*; 
//n th fibinocci number
public class Fibinocci {
	    public static int fibonacciNumber(int n){
	    	int a=0,b=1,sum=0;
	    	if(n==0)
	    	{
	    		return a;
	    	}
	    	for(int i=1;i<=n;i++)
	    	{
	    		sum=a+b;
	    		a=b;
	    		b=sum;
	    	}
	    	return a;
	    }
	    public static void main(String[] args) {
	    	int c=Fibinocci.fibonacciNumber(7);
	    	System.out.println(c);
			
		}
	    	
	    	
	    }

	      
