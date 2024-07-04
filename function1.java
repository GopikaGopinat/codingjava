//function without argument without return value(static method)

package javaProgram;
public class SumAdd {
	public static void add()
	{
  int a=10,b=20,sum;
  sum=a+b;
  System.out.println("Sum is "+sum);
  }
	public static void main(String args[])
	{
		SumAdd.add();
	}
}
