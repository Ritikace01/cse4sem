package lab1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lab1 
{
	public static void main(String args[]) throws IOException
	{   int n;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Value of N");
        n=Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++)
        {
        for(int j=0;j<=i;j++)
        {
        	
        System.out.print("*");	
        }
        	
        System.out.println();
        }
		
		
		
	}
	
}
