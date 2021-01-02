import java.util.*;
public class MultiplicationOfArray {
	int n,product=1;
	int arr[]=new int[100];
void getData()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of elements: ");
	n=sc.nextInt();
	System.out.println("Enter the elements: ");
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
		product*=arr[i];
	}
	System.out.println("The product of array is:"+product);
	
			
}
	public static void main(String[] args) {
MultiplicationOfArray obj=new MultiplicationOfArray();
obj.getData();


	}

}
