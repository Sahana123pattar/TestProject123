package day5;

public class Loopandjump {

	public static void main(String[] args) {
		int a= 1;
		while(a<=10)
		{
			System.out.println(a);
			a++;
		}
		
		//print even num from 1 to 10
		// approach 1
		/*int i= 2;
		while (i<=10)
		{
			System.out.println(i);
			i+=2;
		}
		*/
		// apptoach 2
		/*int i= 2;
		while (i<=10)
		{
			if (i%2==0)
			System.out.println(i);
			i++;
		}
		*/
		
		// example 2 : mention even or odd from 1 to 10
		int i= 2;
		while (i<=10)
		{
			if (i%2==0)
			{
			System.out.println(i + " even");
			}
			else
			{
				System.out.println(i + " odd");
			}
			i++;
		}
		//print dec order 10 to 1 
		int g= 10 ;
		while (g>=1)
		{
			System.out.println(g);
			g--;
			
		}
		// do while 
		// print 1 to 10 
		int h = 1;
			do {
				System.out.println(h);
				h++;
			}while (h<=10);
			
			//for loop 
			
		/*for(int j=1; j<=10; j++)
		{
			System.out.println(j);
		}
		*/
			
		for(int j=1; j<=10; j++)
		{
			if (j%2==0)
			{
				System.out.println("num is even " +j);
			}
			else
			{
				System.out.println("num is odd " +j);
			}
		}
			
		//	jumping statement
			
			for (int s=1; s<10; s++)
			{
				if (s==7)
				{
					break;
				}
				System.out.println(s);
			}
			
			// continue
			for (int p=1; p<10; p++)
			{
				if (p==7)
				{
					continue;
				}
				System.out.println(p);
			}
			
		}
	}
	

}
