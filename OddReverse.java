import java.lang.*;
import java.util.*;
class OddReverse
{
	public static void main(String arg[])
	{
		Scanner sca=new Scanner(System.in);

		System.out.println("enter the first number");
		int num1=sca.nextInt();
		
		System.out.println("enter the second number");
		int num2=sca.nextInt();
		
		for(int i=num2;i>=num1;i--)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}
	}
}