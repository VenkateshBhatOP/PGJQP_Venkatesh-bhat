import java.util.Scanner;
class Even_Odd
{
int num1;
void getData()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a positive integer: ");
num1=sc.nextInt();
if(num1%2==0)
{
System.out.println("The integer is even");
}
else
{
System.out.println("The integer is odd");
}
}
public static void main(String...args)
{
Even_Odd obj=new Even_Odd();
obj.getData();
}
}