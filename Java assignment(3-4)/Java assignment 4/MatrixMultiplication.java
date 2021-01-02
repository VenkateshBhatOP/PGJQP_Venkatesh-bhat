import java.util.Scanner;
public class MatrixMultiplication {
	int n,m,x,y;
	Scanner sc=new Scanner(System.in);
	
	void getDetails()
	{		
		
		System.out.println("Enter the number of rows and columns: ");
		m=sc.nextInt();
		n=sc.nextInt();
		int a[][]=new int[m][n];
		int b[][]=new int[m][n];
		int c[][]=new int[m][n];
		if(m==n)
		{
			
		
		System.out.println("Enter the elements of First  matrix: ");
		for( x=0;x<m;x++)
		{
			for( y=0;y<n;y++)
			{
				a[x][y]=sc.nextInt();
				
					
			}
		System.out.println();

		
		
		}
		System.out.println("Enter the elements of second  matrix: ");
		for( x=0;x<m;x++)
		{
			for( y=0;y<n;y++)
			{
				b[x][y]=sc.nextInt();	
					
			}
		System.out.println();

		
		
		}
	for(x=0;x<m;x++)
	{    
		for(y=0;y<n;y++)
		{    
		c[x][y]=0;      
		for(int k=0;k<m;k++)      
		{      
		c[x][y]+=a[x][k]*b[k][y];      
		}
		System.out.print(c[x][y]+" ");    
		}
		System.out.println();   
		}
		}
}
	public static void main(String[] args)
	{
		MatrixMultiplication obj=new MatrixMultiplication();
		obj.getDetails();
	}
}