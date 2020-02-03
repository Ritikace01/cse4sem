package lab1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class lab2
{
	public static void main(String args[]) throws IOException
	{int n;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter the Number\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
	n=Integer.parseInt(br.readLine());
	switch(n)
	{
	case 1:
	{System.out.println("Enter the two numbers");
	int c;
	int d;
	int sum;
	c=Integer.parseInt(br.readLine());
	d=Integer.parseInt(br.readLine());
	sum=c+d;
	System.out.println(sum);
	break;
	}
	case 2:
	{System.out.println("Enter the two numbers");
	int c;
	int d;
	int sub;
	c=Integer.parseInt(br.readLine());
	d=Integer.parseInt(br.readLine());
	sub=c-d;
	System.out.println(sub);
	break;
	}
	case 3:
	{System.out.println("Enter the two numbers");
		int c;
		int d;
		int mul;
		c=Integer.parseInt(br.readLine());
		d=Integer.parseInt(br.readLine());
		mul=c*d;
		System.out.println(mul);
		
		break;
		
	}
	case 4:
	{try
	{System.out.println("Enter the two numbers");
		int c;
		int d;
		float mul;
		c=Integer.parseInt(br.readLine());
		d=Integer.parseInt(br.readLine());
		mul=c/d;
		System.out.println(mul);
		break;
	}
	catch(ArithmeticException e)
	{
	System.out.println("Dont try to play Smart With me \nRegards\nAnand Pandey ");	
	}
	}	
	default:
	{
		System.out.println("Exit");
	break;
	
	}
	
 }
	
}

		
		
		
		
	}	
	
	
	
	


