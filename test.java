package lab1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class test {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
        int i, j, n;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the height n :");
        n = Integer.parseInt(br.readLine());         //br.readLine() will return strings
                                                     // and out input is integer so a method for conversion//
        for(i=0; i<n; i++)
        {
        	for(j=0; j<i+1; j++)
        	{
        		System.out.print("*");
        	}
        System.out.println();
        }
        
	
}
}
