import java.util.*;
public class SumOfElements {
int n,sum=0;
int arr[]=new int[100];
void getDetails()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of elements: ");
	n=sc.nextInt();
	System.out.println("Enter the elements: ");
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
		sum+=arr[i];
	}
	System.out.println("The sum is: "+sum);
	
}
	public static void main(String[] args) {
		SumOfElements obj=new SumOfElements();
		obj.getDetails();

	}

}
