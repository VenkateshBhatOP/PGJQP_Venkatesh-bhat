import java.util.*;
public class ReverseOfArray {
	int n,i=0,j=0,temp;
	int num[]=new int[100];
	void getData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		n=sc.nextInt();
		System.out.println("Enter the elements: ");
		for(i=0;i<n;i++)
		{
			
			num[i]=sc.nextInt();
		}
		j=i-1;
		i=0;
		sc.close();
		while(i<j)
		{
			temp=num[i];
			num[i]=num[j];
			num[j]=temp;
			i++;
			j--;
		}
		System.out.println("Reversed array: ");
		for(i=0;i<n;i++)
		{
			System.out.println(num[i]+" ");
			
		}
	}
	

	public static void main(String[] args) {
		ReverseOfArray obj=new ReverseOfArray();
		obj.getData();

	}

}
