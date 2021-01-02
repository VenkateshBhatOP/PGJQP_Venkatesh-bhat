import  java.util.*;

public class SortingOfArray {
int n;
int arr[]=new int[100];
void bubbleSort()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of elements: ");
	n=sc.nextInt();
	System.out.println("Enter the elements: ");
	for(int i=0;i<n;i++)
	{
	arr[i]=sc.nextInt();
	}
	for(int i=1;i<n;i++)
	{
		for(int j=0;j<n-1;j++)
		{
			if(arr[j]>arr[j+1])
			{
				int temp;
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	System.out.println("The elements after sorting will be: ");
	for(int j=0;j<n;j++)
	{
		System.out.println(arr[j]);
		
	}
	
}
public static void main(String[] args)
{
	SortingOfArray obj=new SortingOfArray();
	obj.bubbleSort();
}
}
