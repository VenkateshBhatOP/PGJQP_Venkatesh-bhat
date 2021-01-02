import java.util.Scanner;
class Max_Min
{
int n;
int arr[]=new int[5];
void accept()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the elements in the array: ");
n=sc.nextInt();
System.out.println("Enter the elements :");
for (int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
for(int i=1;i<n;i++)
{
for(int j=0;j<n-1;j++)
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
}

 void display()
    {

       System.out.println("The sorted array is: ");
for(int j=0;j<n;j++)
    System.out.println(arr[j]);
    
System.out.println("The max element is : "+arr[0]);
System.out.println("The min element is : "+arr[4]);
}
public static void main(String...args)
{
Max_Min obj=new Max_Min();
obj.accept();
obj.display();
}
}