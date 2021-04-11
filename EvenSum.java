import java.lang.*;
import java.util.*;

class EvenSum
{
	public static void main(String arg[])
	{
		int iSum=0;
		Scanner sca=new Scanner(System.in);

		System.out.println("enter the first number");
		int num1=sca.nextInt();

		System.out.println("enter the second number");
		int num2=sca.nextInt();
		
		for(int i=num1;i<=num2;i++)
		{
			if(i%2==0)
			{
				iSum=iSum+i;
			}
		}
		
			System.out.println(iSum);

	}
}