package lab1;

import java.io.IOException;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Transpose {

	public static void main(String[] args)throws IOException 
	{int i,j;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int size=Integer.parseInt(br.readLine());
	int a[][]=new int[size][size];
	int b[][]=new int[size][size];
	
	for(i=0;i<size;i++)
	 for(j=0;j<size;j++)
	   a[i][j]=Integer.parseInt(br.readLine());
	
	
	
	for(i=0;i<size;i++)
	{for(j=0;j<size;j++)
		{b[i][j]=a[j][i];
		}
	}
	for(i=0;i<size;i++)
		{for(j=0;j<size;j++)
		{ System.out.print(b[i][j]);		
		}
		}
	
	
	
	}

}
