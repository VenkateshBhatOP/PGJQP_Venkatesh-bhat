import java.util.*;
public class MatrixAddition {
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
System.out.println("Your Matrix is : ");
for( x=0;x<m;x++)
{
	for( y=0;y<n;y++)
            {
                System.out.print(a[x][y]+"\t");
                
    			
               
            }
             
            System.out.println();
        }
System.out.print("\n");
for( x=0;x<m;x++)
{
	for( y=0;y<n;y++)
            {
                System.out.print(b[x][y]+"\t");
                
    			
           
            }
             
            System.out.println();
        }
		System.out.println("Sum is: ");
		for(x=0;x<m;x++)
		{
			for(y=0;y<n;y++)
			{
				c[x][y]=a[x][y]+b[x][y];
				
			
		
			System.out.print(c[x][y]+"\t");
			
			}
			
			System.out.println();
			
		}
	
		
		
	}

	public static void main(String[] args) {
		MatrixAddition obj=new MatrixAddition();
		obj.getDetails();
		

	}

}
