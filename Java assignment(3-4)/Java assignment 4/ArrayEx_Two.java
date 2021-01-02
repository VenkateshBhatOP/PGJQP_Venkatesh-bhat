import java.util.Scanner;
class ArraysEx_Two
{
public static void main(String[] args)
{
int arr[]=new int[5];
System.out.println("Enter the values in an array: ");
Scanner sc=new Scanner(System.in);
for(int i=0;i<5;i++)
{
arr[i]=sc.nextInt();
}
System.out.println("The values are: ");
for(int i=0;i<5;i++)
{
System.out.println(2* arr[i]);
}
}
}