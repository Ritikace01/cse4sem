package lab1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class array 
{
	public static void main(String args[]) throws IOException
	{
		int i, j;
		int sum = 0;
		
		int a[][] = new int[20][20];
		int b[][] = new int[20][20];
		int c[][] = new int[20][20];
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the rows and columns of first matrix");
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		
		System.out.println("Enter the first array");
		for(i=0; i<m; i++)
		{
			for(j=0; j<n; j++)
			{
				a[i][j] = Integer.parseInt(br.readLine());
				System.out.print(" ");
			}
		
		}
	    System.out.println("Enter the rows and column of second matrix");
	    int p = Integer.parseInt(br.readLine());
	    int q = Integer.parseInt(br.readLine());
	    
	    System.out.println("Enter the second array");
	    for(i=0; i<p; i++)
	    {
	    	for(j=0; j<q; j++)
	    	{
	    		b[i][j] = Integer.parseInt(br.readLine());
				System.out.print(" ");
	    	}
	    }
	    if(n!=p)
	       {
	    	System.out.println("Cant Multiply");   
	    	System.exit(0);
	       }
	    System.out.println("The multiplication of the two matrix is");
	    for(i=0; i<m; i++)
	    {
	    	for(j=0; j<q; j++)
	    	{
	    		for(int k=0; k<p; k++)
	    		{
	    			sum = sum + (a[i][k]*b[k][j]);
	    			c[i][j] = sum;
	    			sum = 0;
	    		}
	    	} 
	    }
	  System.out.println("The product of the matrices is");
	  for(i=0; i<m; i++)
	  {
		  for(j=0; j<q; j++)
		  {
			  System.out.print(c[i][j]+"  ");
		  }
	   System.out.println(" ");
	  }
	}

}
