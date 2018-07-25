import java.util.*;
class person
{
	String name;
	int age;
	int salary;
	person()
	{
		age=0;
		salary=0;
	}
}
class per
{
	public static void main(String args[])
	{
		person p = new person();
		Scanner s=new Scanner (System.in);
		p.name=s.nextLine();
		p.age=s.nextInt();
		p.salary=s.nextInt();
		System.out.println("Name:" + p.name);
		System.out.println("Age:" + p.age);
		System.out.println("Salary:" + p.salary);
	}
}