package statement;

public class Exa4 
{
public static void main(String[] args) 
{
int marks=77;
if(marks>=85)
{
	System.out.println("distinction");
}
else if(marks>=60 & marks<=64)
{
	System.out.println("1st class");
}
else if(marks>=50 &marks<=59)
{
	System.out.println("2nd class");
	
}
else if(marks>=35 & marks<49)
{
	System.out.println("pass");
	
}
else if(marks>=35 & marks<=49)
{
	System.out.println("pass");
}
else
{
	System.out.println("fail");
}
}
}
