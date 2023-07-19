package statement;

public class Exa5 
{
public static void main(String[] args) 
{
float per= 70.4f;
if(per>=65.6)// outer if 
{
	System.out.println("no deliver charges is apllicable");
	    if(per>=43.4) //inner if or nested if 
	    {
	    System.out.println("no discount");
	    }
	    else if(per>=32.4 & per<=40.6)
	    {
	    	System.out.println("bhai");
	    }
	    else
	    {
	    	System.out.println("10% discount");
	    }
	    
	   }
else
{
	System.out.println("50 rs deliver charges");
}
   
}
}
