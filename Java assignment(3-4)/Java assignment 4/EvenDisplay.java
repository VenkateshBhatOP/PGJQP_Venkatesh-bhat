import java.util.*;
public class EvenDisplay {
int n;
int arr[]=new int[100];
void getData()
{
	Scanner scanner =new Scanner(System.in);
	System.out.println("Enter the number of elements: ");
	n=scanner.nextInt();
	System.out.println("Enter the elements: ");
	for(int i=0;i<n;i++)
	{
		arr[i]=scanner.nextInt();
	}
	System.out.println("Even elements: ");
	for(int i=0;i<n;i++)
	{
		if(arr[i]%2==0)
		{
			System.out.println(arr[i]);
		}
	}
	
}
public static void main(String[] args) {
	EvenDisplay obj=new EvenDisplay();
	obj.getData();
		

	}

}
