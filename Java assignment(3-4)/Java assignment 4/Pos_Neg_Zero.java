import java.util.*;
public class Pos_Neg_Zero {
	int n,pos=0,neg=0,zero=0;
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
		}

		for(int i=0;i<n;i++)
		{
			if(arr[i]>0)
			{
				pos++;
			
			}
			else if(arr[i]<0)
			{
				neg++;
			}
			else if(arr[i]==0)
			{
				zero++;
				
			}
			else
			{
				System.out.println("Enter a valid set of integers");
				
			}
		}
		System.out.println("Positive: "+pos);
		System.out.println("Negative: "+neg);
		System.out.println("Zero: "+zero);
	}
	

	public static void main(String[] args) {
		
Pos_Neg_Zero obj=new Pos_Neg_Zero();
obj.getDetails();
	}

}
