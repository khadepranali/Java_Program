import java.lang.*;
import java.util.*;

class SumEvenOdd
{
	public static void main(String arg[])
	{
		/*Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num=sobj.nextInt();
		
		for(int i=0;i<=num;i++)
		{
			int arr[i]=sobj.nextInt();
		}
		
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}*/
		
		int arr[]={85,66,3,80,93,88};
		int Sum=0,Sum1=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				Sum=Sum+arr[i];
			}
			else
			{
				Sum1=Sum1+arr[i];
			}
		}
		System.out.println(Sum-Sum1);
		//System.out.println(Sum1);
	}
}