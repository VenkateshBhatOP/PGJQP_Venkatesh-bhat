import java.util.*;
public class MatrixTranspose {
int m,n;

void accept()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of rows and columns: ");
	m=sc.nextInt();
	n=sc.nextInt();
	int a[][]=new int[m][n];
	System.out.println("Enter the elements :");
	
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			a[i][j]=sc.nextInt();
		}
		System.out.println();
	}
	System.out.println("Transpose of matrix is :");
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			
			System.out.print(a[j][i]+"  ");
		}
	System.out.println();
	}
	
}
	public static void main(String[] args) {
		MatrixTranspose obj=new MatrixTranspose();
		obj.accept();
	}

}
