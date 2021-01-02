import java.util.*;
public class SearchElement {
	int n,num;
	int arr[]=new int [100];
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		n=sc.nextInt();
		System.out.println("Enter the elements: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element you want to search: ");
		num=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(arr[i]==num)
			{
			   System.out.println("Element found at position "+(i+1));
			}
			
		}	
		
	}
	public static void  main(String[] args)
	{
		SearchElement obj=new SearchElement();
		obj.accept();
	}
		
	}