import java.util.*;
class add
{
	int a;
	int b;
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
		add ad=new add();
		int sum;
		Scanner u= new Scanner (System.in);
		ad.a=u.nextInt();
		ad.b=u.nextInt();
		sum=ad.a + ad.b;
		System.out.println("Sum is " + sum);
	}
}