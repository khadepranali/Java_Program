import java.lang.*;

class DivisibleThreeFive
{
	public static void main(String arg[])
	{
		int arr[]={85,66,3,15,93,88};
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%5==0&&arr[i]%3==0)
			{
				System.out.println(arr[i]);
			}
		}
	}		
}
