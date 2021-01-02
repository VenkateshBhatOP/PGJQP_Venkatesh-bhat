import java.util.Scanner;
import java.util.*;
public class Replace {
	int n,num,nu;
	int arr[]=new int[100];
	void getDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		n=sc.nextInt();
		System.out.println("Enter the elements: ");
		for(int i=1;i<=n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the position where you want the element to be replaced: ");
		num=sc.nextInt();
		System.out.println("Enter the new element: ");
		nu=sc.nextInt();
		for(int j=1;j<=n;j++)
		{
			if(j==num)
			{
				arr[j]=nu;
			}
		
		
		System.out.println(arr[j]);
		}
	}

	public static void main(String[] args) {
		Replace obj=new Replace();
		obj.getDetails();

	}

}
