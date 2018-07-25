import java.util.*;
class rectangle
{
	int l;
	int b;
	int ar;
	rectangle(int length,int breadth)
	{
		l=length;
		b=breadth;
	}
	void area()
	{
		ar=l*b;
	}
}
class rec
{
	public static void main(String args[])
	{
		int length;
		int breadth;
		Scanner s=new Scanner (System.in);
		length=s.nextInt();		
		breadth=s.nextInt();
		rectangle r=new rectangle(length,breadth);
		r.area();
		System.out.println("The area of the rectangle is" + r.ar);
	}
}