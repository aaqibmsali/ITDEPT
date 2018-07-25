import java.util.*;
class add
{
	int a;
	int b;
	int sum;
	add()
	{
		a=0;
		b=0;
	}
}
class addex
{
	public static void main(String args[])
	{
		add z=new add();
		int sum;
		z.a=10;
		z.b=20;
		sum=z.a + z.b;
		System.out.println("Sum is" + sum);
	}
}