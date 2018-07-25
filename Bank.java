import java.util.*;
class Account
{
	char acctype;
	int accno;
	double bal;
	Account()
	{
		accno=0;
		bal=0;
	}
	void credit (int a)
	{
		bal=bal+a;
		if(acctype=='c')
		{
			bal=bal-5;
		}
		else
		{
			bal=bal+(bal*0.05);
		}
	}
	void debit(int a)
	{
		bal=bal-a;
		if(acctype=='c')
		{
			bal=bal-5;
		}
		else
		{
			bal=bal+(bal*0.05);
		}	
	}
}
public class Bank
{
	public static void main(String args[])
	{
		char ch;
		double d;
		int amt;
		Account ac=new Account();
		Scanner s=new Scanner(System.in);
		System.out.println("Accept the Account type:");	
		ac.acctype=s.next().charAt(0);
		System.out.println("Accept the Account number:");
		ac.accno=s.nextInt();
		System.out.println("Accept the Balance:");
		ac.bal=s.nextDouble();
		System.out.println("Accept the Amount:");
		amt=s.nextInt();
		System.out.println("Accept debit or credit:");
		Scanner u=new Scanner(System.in);
		ch=u.next().charAt(0);;
		if(ch=='d')
		{

			ac.debit(amt);
			System.out.println("Balance: "+ac.bal);
		}
		else
		{
			ac.credit(amt);
			System.out.println("Balance: "+ac.bal);
		}
	}
}						
		