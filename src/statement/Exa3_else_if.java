package statement;

public class Exa3_else_if
{
public static void main(String[] args) 
{
int num=33;
if(num>=65)
{
	System.out.println("distinction");
}
else if(num>=60 & num<=64)
{
	System.out.println("1st class");
}
else if(num>=20 & num<=59)
{
	System.out.println("2nd class");
}
else if(num>=35 & num<=49)
{
	System.out.println("pass");

}
else if(num<=35)
{
	System.out.println("fail");
}
}

}
