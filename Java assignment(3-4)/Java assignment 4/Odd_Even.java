import java.util.*;
public class Odd_Even {
	int n,even=0,odd=0;
	int arr[]=new int[100];
	void getData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		n=sc.nextInt();
		System.out.println("Enter the elements in the array: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2==0)
			{
				even++;
			}
			else if (arr[i]%2!=0)
			{
				odd++;
				
			}
				
		}
		System.out.println("Even: "+even);
		System.out.println("odd: "+odd);
		
	}
	

	public static void main(String[] args) {
		
Odd_Even obj=new Odd_Even();
obj.getData();
	}

}
