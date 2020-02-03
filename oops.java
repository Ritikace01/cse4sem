package lab1;

public class oops 
{ 
	public int area(int l)
	{
		System.out.println("The area of the square is :");
		return(l*l);
	}
    public int area(int x, int y)
    {
    	System.out.println("The area of rectangle is :");
    	return(x*y);
    }
    public double area(double r)
    {
    	System.out.println("The area of circle is :");
    	return(3.14*r*r);
    }


public static void main(String args[])
{
	oops a = new oops();
	System.out.println("Area of square is :");
	System.out.println(a.area(2));
	
	System.out.println("Area of rectangle is :");
	System.out.println(a.area(3, 4));
	
	System.out.println("Area of circle is :");
	System.out.println(a.area(3.0));
}
}