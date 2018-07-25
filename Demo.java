import java.util.*;
class Demo
{
	public static void main(String args[])
	{
		int a=42;
		try
		{
			int l=args.length;
			int b=42/l;
			try
			{
				int d=40/(l-1);
				int c[]={1};
				c[90]=6;
			}
			catch(ArithmeticException e)
			{
				System.out.println("Divide by zero error");
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Out of bounds");
		}
		finally
		{
			System.out.println("The program was successfully executed");
		}
	}
}
			