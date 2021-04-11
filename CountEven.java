import java.lang.*;
import java.util.*;

class CountEven
{
	public static void main(String arg[])
	{
		int arr[]={85,66,3,80,93,88};
		int Count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				Count++;
			}
		}
		System.out.println(Count);
		
	}
}