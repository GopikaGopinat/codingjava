package constructor;
public class Grade {
	 int x,y,z;
	static int tot;
	public  int mark()
	{
		tot=x+y+z;
		return tot;
	}
	//public void grade(char g)
	//{
		public void grade()
		{
		if(tot>=90)
		{
			System.out.println("Grade = A");
		}
		else
		{
			System.out.println("Grade = B");
		}
		
	}
	public Grade(int m1,int m2,int m3)
	{
		x=m1;
		y=m2;
		z=m3;	
}
	public static void main(String[] args) {
		Grade s=new Grade(50,25,20);
		Grade s1=new Grade(30,25,25);
		s.mark();
		System.out.println("Total mark of first student = "+tot);
		s.grade();
		System.out.println();
		s1.mark();
		System.out.println("Total mark of second student = "+tot);
		s1.grade();	
	}
}
