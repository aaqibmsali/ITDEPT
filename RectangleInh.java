import java.util.*;
class Rectangle
{
	int length;
	int breadth;
	Rectangle(){length=0;breadth=0;}
	Rectangle(int l,int b)
	{
		length=l;
		breadth=b;
	}
}
class RectangleHeight extends Rectangle
{
	int h,v;
	RectangleHeight(int length,int breadth,int height)
	{
		super(length,breadth);
		h=height;
	}
	void vol()
	{
		v=length*breadth*h;
		System.out.println("Volume: " + v);
	}
}
public class RectangleInh
{
	public static void main(String args[])
	{
		int l,b,h;
		Scanner s=new Scanner(System.in);
		l=s.nextInt();
		b=s.nextInt();
		h=s.nextInt();
		RectangleHeight rh = new RectangleHeight(l,b,h);
		rh.vol();
	}
}