package lab1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lower 
{
	public static void main(String args[]) throws IOException
	{
		int i, j;
		int rows = 0;
		int jagged[][] = new int[rows][];
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the rows");
		rows = Integer.parseInt(br.readLine());
		
		for(i=0; i<jagged.length; i++)
		{
			jagged[i] = new int[i+1];
		}
		System.out.println("Enter the jagged array");
	    for(i=0; i<jagged.length; i++)
	    {
	    	for(j=0; j<jagged[i].length; j++)
	    	{
	    		jagged[i][j] = Integer.parseInt(br.readLine());
	    		System.out.print(" ");
	    	}
	    }
	    System.out.println("The jagged matrix is");
	    for(i=0; i<jagged.length; i++)
	    {
	    	for(j=0; j<jagged[i].length; j++)
	    	{
	    		System.out.print(jagged[i][j]);
	    	}
	        System.out.println(" ");
	    }
	    for(i=0; i<jagged.length; i++)
	    {
	    	for(j=0; j<jagged[i].length; j++)
	    	{
	    		if(i<j)
	    		{
	    			System.out.print("0");
	    		}
	    			else
	    			{
	    				System.out.print(jagged[i][j]+" ");
	    			}
	    		}
	    	}
	    	System.out.println(" ");
	    }

}
