package statement;

public class Exa8 
{

	public static void main(String[] args) 
	{
	int Sa=1000;
	int amt= 200;
	if(Sa>=500)// outer if 
	{
		System.out.println("no delivery charges is apllicable");
		    if(Sa>=1200) //inner if or nested if 
		    {
		    System.out.println("10% discount");
		    }
		    else if(Sa>=300 & Sa<=1500)
		    {
		    	System.out.println("buy 1 get 1");
		    }
		    else
		    {
		    	System.out.println("no discount");
		    }
		    if(amt>=100) //inner if or nested if 
		    {
		    System.out.println("additional 10% discount");
		    }
		    else
		    {
		    	System.out.println("no discount");
		    }
		   }
	else
	{
		System.out.println("50 rs delivery charges");
	}
	}
}
