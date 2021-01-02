import java.util.*;
public class Second_Maximum {
	int n;
	int arr[]=new int[100];
	void display()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		n=s.nextInt();
		System.out.println("Enter the elements: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		
	}
	void bubbleSort()
	
	{
		Scanner s=new Scanner(System.in);
		for(int i=1;i<n;i++)
		{
			for( int j=0;j<n-1;j++)
			{
				if(arr[j]<arr[j+1])
				{
					int temp;
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("\n The Descending order is:");
		for(int j=0;j<n;j++)
		{
			
			System.out.println(arr[j]);
			
		}
		System.out.println("\n The second highest number is:"+arr[1]);
		
	}
	


public static void main(String[] args) {
	Second_Maximum obj=new Second_Maximum();
	obj.display();
	obj.bubbleSort();
	
}
}
