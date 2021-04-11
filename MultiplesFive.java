import java.lang.*;

class MultiplesFive
{
	public static void main(String arg[])
	{
		int arr[]={85,66,3,55,93,88};
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%11==0)
			{
				System.out.println(arr[i]);
			}
		}
	}		
}