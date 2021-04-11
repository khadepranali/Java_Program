import java.lang.*;
import java.util.*;

class NumberToWord
{
	public static void main(String arg[])
	{
		Scanner sca=new Scanner(System.in);

		System.out.println("enter the number");
		int num=sca.nextInt();
		
		switch(num)
		{
			case 0:
				System.out.println("Zero");
				break;
			case 1:
				System.out.println("one");
				break;
			case 2:
				System.out.println("two");
				break;
			case 3:
				System.out.println("three");
				break;
			case 4:
				System.out.println("four");
				break;
			case 5:
				System.out.println("five");
				break;
			case 6:
				System.out.println("six");
				break;
			default:
				System.out.println("Default");
		}
	}
}