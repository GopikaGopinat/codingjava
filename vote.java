package constructor;
public class Vote {
	static int age=19;
	public static boolean Age( )
	{
		
		if(age>=18)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

public static void main(String args[])
{
	boolean s;
	 s=Vote.Age();
	 System.out.println(s);
}
}


