package day2;

public class VariablesDatatypes {

	public static void main(String[] args) {
	//int a = 10; 
	//declared and assigned 
	//System.out.println(a);
	
	// Approach 1 
	/*int a= 10;
	int b=20;
	int c= 30;
	*/
	
	// approach 2
	/* int a,b,c;
	  a= 10;
	  b= 20;
	  c= 30;
	  */
	
// Approach 3 if all value belongs to same data type
	int a=100, b=200, c=300;
	//System.out.println("the value of a is" +a);
// or	
	System.out.println(a+" "+b+ " " +c);
	
	// operators 
	int f=20, d= 10;
	int result = f+d;
	System.out.println("sum of a and d is :" +result);
	System.out.println("substraction of a and d is :" +(f-d));
	System.out.println("multiplication of a and d is :" +(f*d));
	System.out.println("modulus of a and d is :" +(f%d));
	
	// raletional oprator
	int g=20, h=10;
	System.out.println(f>d);
	// or
	boolean res = g>h;
	System.out.println(res);
	
	//logical op
	/*boolean x= true ;
	boolean y = false;
	System.out.println(x && y);
	System.out.println(x || y);
	*/
	
	//eg2 
	System.out.println((10<20) && (2<1));
	
	//increament operator
	
	/*System.out.println(a);
	a++;
	System.out.println(a);
	*/
	
	// post increament 
	/*int i = 10;
	int rest = i++;
	System.out.println(rest);// still 10 
	System.out.println(i); // 11
	*/
	int i = 10;
	int rest = ++i;
	System.out.println(rest);// 11 
	System.out.println(i); // 11
	
	//decreament
	a--;
	System.out.println(a);
	
	//post decr.
	/*int j = 10;
	int restj = j--;
	System.out.println(restj);// 
	System.out.println(j); //
	*/
	// pre decreamnt 
	int j = 10;
	int restj = --j;
	System.out.println(restj);// 11 
	System.out.println(j); // 11
	
	//Assignment opr
	 int k= 10;
	 //k+=5;
	 //k= k+5;
	// k-=5;
	 // k*=5;
	  k%=5;
	 System.out.println(k);
	 
	 // ternary oprator
	 // var= exp ? result1 : result2;
	 int l= 200, m= 100;
	 int x= (l>m)? l : m;
	 System.out.println(x);

	 
	
	
	
	


	 
	

	}

}
