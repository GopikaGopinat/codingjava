package array;

public class Insertion {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		int n=6;
		int pos=5;
		int x=7;
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Inserted array");
		int arr1[]=new int[n+1];
		for(int i=0;i<n+1;i++)
		{
				if(i<pos-1)
				{
					arr1[i]=arr[i];
				}
				else if(i==pos-1)
				{
					arr1[i]=x;
				}
				else if(i>pos-1)
				{
					arr1[i]=arr[i-1];
				}
		}
		for(int i=0;i<n+1;i++)
		{
		System.out.print(arr1[i]+" ");
		}
		
		}

}
