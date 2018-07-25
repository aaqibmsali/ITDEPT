import java.util.*;
class circle
{
	double r;
	double pi;
	double cir;
	double area;
	circle()
	{
		pi=3.14;
		r=0;
	}
	void area(double r)
	{
		cir=2*pi*r;
		area=pi*r*r;
	}
}
class cir
{
	public static void main(String args[])
	{
		circle c=new circle();
		Scanner u=new Scanner (System.in);
		c.r=u.nextDouble();
		c.area(c.r);
		System.out.println("The circumference is " + c.cir);
		System.out.println("The area is " + c.area);
	}
}