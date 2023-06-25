import java.util.Scanner;
public class Atm_interface
{
	static int count=0;
public static void main(String args[])
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter user name =>");
    String userName = scan.nextLine();

    System.out.println("Enter password =>");
    String password = scan.nextLine();

    if ("Pratik".equals(userName) && "Bele@123".equals(password))
    {
        System.out.println(" User successfully logged-in.. ");
        count++;
    } 
    else
    {
    	System.out.println("check login password");
    }
	if(count==1)
	{
        while(true)
        {
	System.out.println("**ATM INTERFACE**");
	System.out.println("Press 1 to Withdraw");
	System.out.println("Press 2 to Deposit");
	System.out.println("Press 3 to Transfer");
	System.out.println("Press 4 to Transaction History");
	System.out.println("Press 5 to exit");
	int num=scan.nextInt();
	switch(num)
	{
	case 1:
		ATM obj=new ATM();
		obj.Withdraw();
		break;
	case 2:
		ATM obj1=new ATM();
		obj1.Deposit();
		break;
	case 3:
		ATM obj3=new ATM();
		obj3.Transfer();
		break;
	case 4:
		ATM obj4=new ATM();
		obj4.History();
		break;
	case 5:
		ATM obj5=new ATM();
		obj5.exit();
		break;
		default:
			System.out.println("Invalid number");
	}
}
}
}
}
class ATM
{
static float balance=20000f;
static int withdraw;
static int deposit;
char r;
static float amount;
void Withdraw()
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter money to be withdraw");
	withdraw=scan.nextInt();
	if(balance>=withdraw)
	{
		balance=balance-withdraw;
	System.out.println("Don't forget to collect your cash");
	System.out.println("Do you want to display your current action on screen"+"Press Y for Yes or N for No");
	r=scan.next().charAt(0);
	if(r=='Y'||r=='y')
	{
		System.out.println("Your Current balance is"+balance);
	}
	System.out.println("Thank You for using it");
	}
    else
    {
	System.out.println("Balance limit is lower than your requirements");
    }
}
void Deposit()
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter money to be deposit");
	deposit=scan.nextInt();
	balance=balance+deposit;
	System.out.println("Your cash is sucessfully deposited");
	System.out.println("Do you want to display your current action on screen"+"Press Y for Yes or N for No");
	r=scan.next().charAt(0);
	if(r=='Y'||r=='y')
	{
		System.out.println("Your Current balance is"+balance);
	}
	System.out.println("Thank You for using it");
}
void Transfer()
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter receipent username");
	String name=scan.nextLine();
	System.out.println("Enter amount to be transfer");
	amount=scan.nextFloat();
	if(balance>=amount)
	{
		balance=balance-amount;
		System.out.println("Your cash is sucessfully transfered");
		System.out.println("Do you want to display your current action on screen"+"Press Y for Yes or N for No");
		r=scan.next().charAt(0);
		if(r=='Y'||r=='y')
		{
			System.out.println("Your Current balance is"+balance);
		}
	}
		else
		{
			System.out.println("Sorry! Limit is out of range");
		}
		System.out.println("Thank You for using `it");
	
	}
void History()
		{
	    System.out.println("Your Mini Statement is Here");
	    System.out.println("Withdraw:"+withdraw+"      "+"Deposit:"+deposit+"\n"+"Blance:"+balance+"     "+"Transaction balance"+amount);
		}

void exit()
{
	System.exit(0);
}
}