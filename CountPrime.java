import java.lang.*;
import java.util.*;
class CountPrime
{
	public static void main(String arg[])
	{
		int count=0;
		char arr[]={'I','a','m','A','j','a','v','a','Q','A'};
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]=='a')
			{
				count++;
			}
		}
		System.out.println(count);
		
	}
}