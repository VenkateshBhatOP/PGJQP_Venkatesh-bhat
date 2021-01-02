import java.util.*;
public class OddDisplay {
int n;
int arr[]=new int[100];
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
	System.out.println("The Odd elements are: ");
	for(int i=0;i<n;i++)
	{
		if(arr[i]%2!=0)
		{
			System.out.println(arr[i]);
		}
	}
}
	public static void main(String[] args) {
		OddDisplay obj=new OddDisplay();
		obj.accept();

	}

}
