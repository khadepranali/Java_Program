import java.lang.*;

class ReverseArray
{
	public static void main(String arg[])
	{
		int arr[]={11,22,33,44,55};
		
		System.out.println("before Swaping");

		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("After Swaping");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}
}