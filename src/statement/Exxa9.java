package statement;

public class Exxa9 
{
public static void main(String[] args) 
{
	int a=20;
	int b =40;
	if(a>=10)  // outer if 
	{
		System.out.println("pass");
	if(b>=40) // nested if
	{
		System.out.println("correct input");
	}
	else if(a>=30 & a<=10)
	{
		System.out.println("condition");
	}
		else if(b>=20 & b<=50)
		{
			System.out.println(" 2nd condition");
		}
	else
	{
		System.out.println("wrong input");
	}
	}

	else // outer else 
	{
		System.out.println("fail");
	}
}
}
