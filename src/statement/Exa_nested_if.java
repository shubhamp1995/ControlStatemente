package statement;

public class Exa_nested_if
{
	public static void main(String[] args) 
	{
	int dosa=500;
	int dosa2=200;
	if(dosa>=100)// outer if 
	{
		System.out.println("print dosa");
     if(dosa==200) //inner if or nested if 
		    {
		    System.out.println(" give dosa and return 100 rs");
		    if (dosa==500) 
		    {
		    	System.out.println("give dosa and return 400 rs");
		    }
		  else
		   {
			   System.out.println("v ");
		   }
		    }
		   
		    else
		    {
		    	System.out.println(" b");
		    }
		   }
	else
	{
		System.out.println("a");
	}
	}

}
