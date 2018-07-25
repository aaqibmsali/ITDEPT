import java.util.*;
class exc
{
	static void divide(int num1,int num2)
	{
		try
		{
			int num3;
			num3=num1/num2;
			throw new ArithmeticException("Divide zero");
		}
		finally
		{		
			System.out.println("Executed Successfully");
		}
	}
	public static void main(String args[])
	{
		int num1,num2;
		System.out.println("Accept numbers:");
		Scanner s=new Scanner(System.in);
		num1=s.nextInt();
		num2=s.nextInt();
		divide(num1,num2);
	}
}	