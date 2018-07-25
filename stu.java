import java.util.*;
class student
{
	String name;
	int rollno;
	int mark1;
	int mark2;
	student()
	{
		rollno=0;
		mark1=0;
		mark2=0;
	}
}
class stu
{
	public static void main(String args[])
	{
		student [5]s=new student[5];
		Scanner s=new Scanner (System.in);
		int i;
		for(i=0;i<5;i++)
		{
			s[i].name=s.nextLine();
			s[i].rollno=s.nextInt();
			s[i].mark1=s.nextInt();
			s[i].mark2=s.nextInt();
			System.out.println("Student " + i);
			System.out.println("Name:" + s[i].name);
			System.out.println("Rollno:" + s[i].rollno);
			System.out.println("Mark 1:" + s[i].mark1);
			System.out.println("Mark 2:" + s[i].mark2);
		}
	}
}