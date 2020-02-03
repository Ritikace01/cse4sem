package lab1;

public class construct 
{
	construct(int l)
	{
		System.out.println("Constructor with one argument :" +l);
	}
	public int area(int l)
	{
		System.out.println("The area of the square is :");
		return(l*l);
	}
	
	construct(int x, int y)
	{
		System.out.println("Constructor with two arguments :" +x +y);
	}
    public int area(int x, int y)
    {
    	System.out.println("The area of rectangle is :");
    	return(x*y);
    }
    
    construct(double r)
    {
    	System.out.println("Constructor with one argument :" +r);
    }
    public double area(double r)
    {
    	System.out.println("The area of circle is :");
    	return(3.14*r*r);
    }


public static void main(String args[])
{
	System.out.println("Area of square is :");
	construct a = new construct(2);
	System.out.println(a.area(2));
	
	
	System.out.println("Area of rectangle is :");
	construct a1 = new construct(3, 4);
	System.out.println(a1.area(3, 4));
	
	System.out.println("Area of circle is :");
	construct a2 = new construct(3.0);
	System.out.println(a2.area(3.0));
}

}
