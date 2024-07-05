package day4;

public class Conditionop {

	public static void main(String[] args) {
		int person_age = 16;
		// type 1
	/*if (person_age >=18)
	{
		System.out.println("person is eligible for voting");
	}
*/
		// type 2 : if else
		if (person_age >=18)
		{
			System.out.println("person is eligible for voting");
		}
		else 
		{
			System.out.println("not eligible for voting");
		}
		
		// if else id else : number is odd or even
		
		int a= 20;
		if (a%2 == 0)
		{
		System.out.println("number is even");	
		}
		else
		{
			System.out.println("number is not even");
		}
		
		// number is positive, nagetive
		int n= -10;
		if (n>0)
		{
			System.out.println("number is positive");
		}
	
		else if (n<0)
		{
			System.out.println("number is negative");
		}
		else
		{
			System.out.println("number is zero");
		}
	
		// largest number
	
	int x=10, y=20, z=30;
	if(x>y && x>z)
	{
		System.out.println("x is largest num");
	}
 else if (y>x && y>z)
	{
		System.out.println("y is largest num");
	}
	else
	{
		System.out.println("z is largest num");
	}
	
	// nested if case
	if (true)
	{
		if(true)
		{
System.out.println(" abc ");
		}
		else 
		{
			System.out.println("dfe");
		}
	}
		else
		{
			System.out.println("ghi");
		}
	
	// switch case 
	int weeknum = 1;
	switch (weeknum)
	{
	case 1:System.out.println("monday"); break;
	case 2:System.out.println("tuesfay"); break;
	case 3:System.out.println("wesday"); break;
	case 4:System.out.println("thusday"); break;
	case 5:System.out.println("friday"); break;
	case 6:System.out.println("saturday"); break;
	case 7:System.out.println("sunday"); break;
	default:System.out.println("not valid week number");
	}
	

}
}